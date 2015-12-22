package nth.introspect.apps.docgenforjavaproj.dom.page;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class ElementUtil {

	public static List<Node> findAllNodesBefore(Element firstChapter) {
		List<Node> foundNodes = new ArrayList<>();
		List<Node> parentNodes = getAllNodes(firstChapter.parent());
		for (Node node : parentNodes) {
			if (node instanceof Element) {
				Element element = (Element) node;
				if ("h1".equals(element.tagName())) {
					return foundNodes;
				}
			}
			foundNodes.add(node);
		}
		return foundNodes;
	}

	public static List<Node> getAllNodes(Element element) {
		try {
			Field childNodesField = Node.class.getDeclaredField("childNodes");
			childNodesField.setAccessible(true);
			@SuppressWarnings("unchecked")
			List<Node> childNodes = (List<Node>) childNodesField.get(element);
			return childNodes;
		} catch (Exception e) {
			throw new RuntimeException("Could not get the nodes of element: "
					+ element, e);
		}
	}

	public static void addAllNodes(Element parent, List<Node> childNodes) {
		for (Node child : childNodes) {
			parent.appendChild(child);
		}
	}

	public static List<Node> findChapterNodes(Element h1) {

		List<Node> chapterNodes = new ArrayList<>();
		Element parent = h1.parent();

		if (parent == null) {
			return chapterNodes;
		}

		List<Node> parentNodes = ElementUtil.getAllNodes(parent);
		chapterNodes.add(h1);
		int startIndex = parentNodes.indexOf(h1) + 1;

		for (int index = startIndex; index < parentNodes.size(); index++) {
			Node parentNode = parentNodes.get(index);
			if (parentNode instanceof Element
					&& ((Element) parentNode).tagName().equals("h1")) {
				return chapterNodes;
			} else {
				chapterNodes.add(parentNode);
			}
		}
		return chapterNodes;
	}

	public static Elements findAElementsWithId(Elements elements, String id) {
		StringBuilder query = new StringBuilder();
		query.append("a[id=");
		query.append(id);
		query.append("]");
		Elements found = elements.select(query.toString());
		return found;
	}

	public static Element findPreviousHElement(Elements sequence,
			Element reference) {
		int index=sequence.indexOf(reference);
		for (index=sequence.indexOf(reference);index>=0;index--) {
			Element element=sequence.get(index);
			if (element.tagName().startsWith("h")) {
				return element;
			}
		}
		return null;
	}
}

package nth.reflect.meyn.prod.spec.doc.gen;

import java.util.Arrays;
import java.util.List;

import nth.reflect.fw.ui.style.MaterialColorPalette;
import nth.reflect.fw.ui.style.ReflectColors;
import nth.reflect.fw.ui.swing.ReflecttApplicationForSwing;
import nth.reflect.meyn.prod.spec.doc.gen.dom.generator.ProductSpecificationDocumentGenerator;
import nth.reflect.meyn.prod.spec.doc.gen.dom.order.SalesOrderService;

public class MeynProductSpecifications extends ReflecttApplicationForSwing {

	public static void main(String[] commandLineArguments) {
		launch();
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return Arrays.asList(ProductSpecificationDocumentGenerator.class, SalesOrderService.class);
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return Arrays.asList();
	}

	@Override
	public ReflectColors getColors() {
		return new ReflectColors(MaterialColorPalette.green700(), MaterialColorPalette.orange500(),
				MaterialColorPalette.white());
	}

}

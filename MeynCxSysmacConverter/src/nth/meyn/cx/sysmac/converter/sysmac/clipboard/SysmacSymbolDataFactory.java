package nth.meyn.cx.sysmac.converter.sysmac.clipboard;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.UUID;

import javax.swing.plaf.synth.SynthSliderUI;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.StringUtils;

import nth.meyn.cx.sysmac.converter.cx.ladder.model.CxVariable;
import nth.meyn.cx.sysmac.converter.util.StringToArrayCodeUtil;

public class SysmacSymbolDataFactory {

	/**
	 * Created with {@link #getLadderData()} and then
	 * {@link StringToArrayCodeUtil#print(String)}<br>
	 * First copy Ladder program in Sysmac, than: <br>
	 * {@code String sysmacSymbolData=SysmacClipboard.getSymbolData();}<br>
	 * {@code String byteArrayCode = StringToArrayCodeUtil.print(sysmacSymbolData);}<br>
	 * {@code System.out.println(byteArrayCode);}
	 * 
	 * @return string for clipboard
	 */
	public static String createExample() {
		byte[] array = DatatypeConverter.parseHexBinary(
				"96A79EFD133B7043A67956106BB288FB0001000000FFFFFFFF01000000000000000C020000004A4E6578436F72652C2056657273696F6E3D312E302E302E302C2043756C747572653D6E65757472616C2C205075626C69634B6579546F6B656E3D3966386364366365383536636532356305010000004E4F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E506F755661726961626C65436C6970626F6172644461746104000000193C44657669636549643E6B5F5F4261636B696E674669656C64163C506F7549643E6B5F5F4261636B696E674669656C64273C506F755661726961626C655461626C655265636F72643E6B5F5F4261636B696E674669656C64313C52656C61746564476C6F62616C5661726961626C655461626C655265636F72643E6B5F5F4261636B696E674669656C64030304040B53797374656D2E477569640B53797374656D2E47756964494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F726402000000494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F7264020000000200000004FDFFFFFF0B53797374656D2E477569640B000000025F61025F62025F63025F64025F65025F66025F67025F68025F69025F6A025F6B00000000000000000000000807070202020202020202F792AC24231967423F9F5C9A54EDC52101FCFFFFFFFDFFFFFFA767EAF223891F4E98C722AF34C265AD090500000009060000000505000000494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F726406000000223C456E636F646564456E74697479446174613E6B5F5F4261636B696E674669656C64223C456E636F646564446174614C656E6774683E6B5F5F4261636B696E674669656C641B3C456E74697479547970653E6B5F5F4261636B696E674669656C64183C537562747970653E6B5F5F4261636B696E674669656C64183C56657273696F6E3E6B5F5F4261636B696E674669656C64153C4E616D653E6B5F5F4261636B696E674669656C640700010100010208060200000009070000001A0100000608000000095661726961626C65730609000000064C61646465720000000000000000060A000000095661726961626C6573010600000005000000090B0000004C000000060C000000095661726961626C6573060D00000006476C6F62616C0000000000000000060E00000010476C6F62616C205661726961626C65730F070000001A010000025B534C57442076657273696F6E3D312E305D0D0A5F454E3D5661726961626C65730D0A2B474E3D564152094756543D44656661756C7447726F75700D0A2B2B443D424F4F4C094E3D6954657374310949443D30376339333335362D336464382D346533622D383936662D34373838303030303030303909473D56415209436F6D3D496E707574207661726961626C6520310D0A2B2B443D424F4F4C094E3D6F54657374310949443D30376339333335362D336464382D346533622D383936662D34373838303030303030306209473D56415209436F6D3D4F7570757420766172696162616C6520310D0A2B474E3D5641525F45585445524E414C0947413D45787465726E616C094756543D45787465726E616C47726F75700D0A0F0B00000000010000025B534C57442076657273696F6E3D312E305D0D0A5F454E3D5661726961626C65730D0A2B474E3D5641525F474C4F42414C094756543D476C6F62616C4E616D65737061636547726F75700D0A0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000B");
		String symbolData = new String(array);
		return symbolData;
	}

	public static String create(Set<CxVariable> cxVariables) {
		StringBuilder data = new StringBuilder();
		data.append(createPrefix());
		for (CxVariable cxVariable : cxVariables) {
			data.append(createVariableLine(cxVariable));
		}
		data.append(createPostFix());

//		String created = data.toString();
//		String example = createExample();
//		String clipboard = SysmacClipboard.getSymbolData();
//		System.out.println(StringUtils.indexOfDifference(example, created));
//		
//		byte b1=(byte)clipboard.charAt(612);
//		byte b2=(byte)clipboard.charAt(613);
//		
//		byte[] ba1=new byte[] {0,0,b1,b2};
//		ByteBuffer bb1=ByteBuffer.wrap(ba1);
//		int bi1 = bb1.getInt();
//		
//	
//		byte[] ba2=new byte[] {0,0,b2,b1};
//		ByteBuffer bb2=ByteBuffer.wrap(ba2);
//		int bi2 = bb2.getInt();
//	
//		
//		System.out.println( (byte)clipboard.charAt(612) +":"+(byte)clipboard.charAt(613)+":"+clipboard.length()+":"+getVariableLength(clipboard));
//		System.out.println((byte)example.charAt(612) +":"+(byte)example.charAt(613)+":"+example.length()+":"+getVariableLength(example));
		return data.toString();
	}

	private static int getVariableLength(String data) {
		int startPos=data.indexOf("+GN=VAR	GVT=DefaultGroup");
		int endPos=data.indexOf("+GN=VAR_EXTERNAL	GA=External	GVT=ExternalGroup");
		int l=endPos-startPos;
		return l;
	}

	// ++D=BOOL N=iTest1 ID=07c93356-3dd8-4e3b-896f-478800000009 G=VAR Com=Input
	// variable 1
	private static String createVariableLine(CxVariable cxVariable) {
		StringBuilder data = new StringBuilder();
		data.append("++D=");
		data.append(cxVariable.getType().toString());
		data.append("\tN=");
		data.append(cxVariable.getName());
		data.append("\tID=");
		if (cxVariable.getName().equals("iTest1")) {
			data.append("07c93356-3dd8-4e3b-896f-478800000009");
		} else if (cxVariable.getName().equals("oTest1")) {
			data.append("07c93356-3dd8-4e3b-896f-47880000000b");
		}
//		data.append(UUID.randomUUID());
		data.append("\tG=VAR");
		if (StringUtils.isNotEmpty(cxVariable.getComment())) {
			data.append("\tCom=");
			data.append(cxVariable.getComment());
		}	
		data.append("\r\n");
		return data.toString();
	}

	private static String createPostFix() {
		// String s = createExample();
		// System.out.println(s);
		// String prefix=s.substring(s.indexOf("+GN=VAR_EXTERNAL"));
		// System.out.println(prefix);
		// System.out.println(StringToArrayCodeUtil.print(prefix));
		byte[] postFix = DatatypeConverter.parseHexBinary(
				"2B474E3D5641525F45585445524E414C0947413D45787465726E616C094756543D45787465726E616C47726F75700D0A0F0B00000000010000025B534C57442076657273696F6E3D312E305D0D0A5F454E3D5661726961626C65730D0A2B474E3D5641525F474C4F42414C094756543D476C6F62616C4E616D65737061636547726F75700D0A0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000B");
		return new String(postFix);
	}

	private static String createPrefix() {
		// String s = createExample();
		// System.out.println(s);
		//
		// String prefix=s.substring(0,s.indexOf("+GN=VAR
		// GVT=DefaultGroup")+"+GN=VAR GVT=DefaultGroup".length());
		//
		// System.out.println(prefix);
		//
		// System.out.println(StringToArrayCodeUtil.print(prefix));
		byte[] prefix = DatatypeConverter.parseHexBinary(
				"96A79EFD133B7043A67956106BB288FB0001000000FFFFFFFF01000000000000000C020000004A4E6578436F72652C2056657273696F6E3D312E302E302E302C2043756C747572653D6E65757472616C2C205075626C69634B6579546F6B656E3D3966386364366365383536636532356305010000004E4F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E506F755661726961626C65436C6970626F6172644461746104000000193C44657669636549643E6B5F5F4261636B696E674669656C64163C506F7549643E6B5F5F4261636B696E674669656C64273C506F755661726961626C655461626C655265636F72643E6B5F5F4261636B696E674669656C64313C52656C61746564476C6F62616C5661726961626C655461626C655265636F72643E6B5F5F4261636B696E674669656C64030304040B53797374656D2E477569640B53797374656D2E47756964494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F726402000000494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F7264020000000200000004FDFFFFFF0B53797374656D2E477569640B000000025F61025F62025F63025F64025F65025F66025F67025F68025F69025F6A025F6B00000000000000000000000807070202020202020202F792AC24231967423F9F5C9A54EDC52101FCFFFFFFFDFFFFFFA767EAF223891F4E98C722AF34C265AD090500000009060000000505000000494F6D726F6E2E437861702E4D6F64756C65732E4E65785661726961626C652E436F72652E5661726961626C65436C6970626F6172642E5661726961626C655461626C655265636F726406000000223C456E636F646564456E74697479446174613E6B5F5F4261636B696E674669656C64223C456E636F646564446174614C656E6774683E6B5F5F4261636B696E674669656C641B3C456E74697479547970653E6B5F5F4261636B696E674669656C64183C537562747970653E6B5F5F4261636B696E674669656C64183C56657273696F6E3E6B5F5F4261636B696E674669656C64153C4E616D653E6B5F5F4261636B696E674669656C640700010100010208060200000009070000001A0100000608000000095661726961626C65730609000000064C61646465720000000000000000060A000000095661726961626C6573010600000005000000090B0000004C000000060C000000095661726961626C6573060D00000006476C6F62616C0000000000000000060E00000010476C6F62616C205661726961626C65730F070000001A010000025B534C57442076657273696F6E3D312E305D0D0A5F454E3D5661726961626C65730D0A2B474E3D564152094756543D44656661756C7447726F75700D0A");
		return new String(prefix);
	}
}
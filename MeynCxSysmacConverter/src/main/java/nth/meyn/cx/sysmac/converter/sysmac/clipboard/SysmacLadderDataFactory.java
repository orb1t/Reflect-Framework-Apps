package nth.meyn.cx.sysmac.converter.sysmac.clipboard;

import java.nio.ByteBuffer;

import javax.xml.bind.DatatypeConverter;

import nth.meyn.cx.sysmac.converter.util.StringToArrayCodeUtil;

public class SysmacLadderDataFactory {

	private static final byte MOST_SIGNIFICANT_BIT = (byte) 128;

	/**
	 * Created with {@link #getLadderData()} and then
	 * {@link StringToArrayCodeUtil#print(String)}<br>
	 * First copy Ladder program in Sysmac, than: <br>
	 * {@code String sysmacLadderXml=SysmacClipboard.getLadderXml();}<br>
	 * {@code String byteArrayCode = StringToArrayCodeUtil.print(sysmacLadderXml);}<br>
	 * {@code System.out.println(byteArrayCode);}
	 * 
	 * @return string for clipboard
	 */
	public static String createExample() {
		byte[] array = DatatypeConverter.parseHexBinary(
				"96A79EFD133B7043A67956106BB288FB0001000000FFFFFFFF0100000000000000060100000089113C52756E67733E0D0A20203C52756E67584D4C20436F6D6D656E743D2222204C6162656C3D2222204865696768743D2234372E343030303030303030303030303036222057696474683D22363631223E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030303222206C6164646572456C656D656E74547970653D22436F6E746163742220696E7665727465643D2266616C736522206469666655703D2266616C7365222064696666446F776E3D2266616C736522207661726961626C654E616D653D226954657374312220626173655661726961626C654E616D653D22695465737431222050726F6772616D4E616D653D2253696D706C655468696E67732220626173655661726961626C6544617461547970653D22424F4F4C223E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D22696E7075742220696E7374616E636549443D2230783030303030303033223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304322202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D226F75747075742220696E7374616E636549443D2230783030303030303034223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304422202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A202020203C2F4C6164646572456C656D656E743E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030303522206C6164646572456C656D656E74547970653D22436F696C2220696E7665727465643D2266616C736522206469666655703D2266616C7365222064696666446F776E3D2266616C736522207365743D2266616C7365222072657365743D2266616C736522207661726961626C654E616D653D226F54657374312220626173655661726961626C654E616D653D226F5465737431222050726F6772616D4E616D653D2253696D706C655468696E67732220626173655661726961626C6544617461547970653D22424F4F4C223E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D22696E7075742220696E7374616E636549443D2230783030303030303036223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304422202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D226F75747075742220696E7374616E636549443D2230783030303030303037223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304522202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A202020203C2F4C6164646572456C656D656E743E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030303822206C6164646572456C656D656E74547970653D22436F6E6E656374696F6E222049734C656674506F7765725261696C3D2274727565222049735269676874506F7765725261696C3D2266616C7365223E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D226F75747075742220696E7374616E636549443D2230783030303030303039223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304322202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A202020203C2F4C6164646572456C656D656E743E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030304122206C6164646572456C656D656E74547970653D22436F6E6E656374696F6E222049734C656674506F7765725261696C3D2266616C7365222049735269676874506F7765725261696C3D2274727565223E0D0A2020202020203C436F6E6E656374696F6E506F696E7420636F6E6E656374696F6E506F696E74547970653D22696E7075742220696E7374616E636549443D2230783030303030303042223E0D0A20202020202020203C4564676520696E7374616E636549443D223078303030303030304522202F3E0D0A2020202020203C2F436F6E6E656374696F6E506F696E743E0D0A202020203C2F4C6164646572456C656D656E743E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030304322206C6164646572456C656D656E74547970653D22456467652220736F7572636549443D2230783030303030303039222074617267657449443D22307830303030303030332220466F63757361626C653D227472756522202F3E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030304422206C6164646572456C656D656E74547970653D22456467652220736F7572636549443D2230783030303030303034222074617267657449443D22307830303030303030362220466F63757361626C653D227472756522202F3E0D0A202020203C4C6164646572456C656D656E7420696E7374616E636549443D223078303030303030304522206C6164646572456C656D656E74547970653D22456467652220736F7572636549443D2230783030303030303037222074617267657449443D22307830303030303030422220466F63757361626C653D227472756522202F3E0D0A20203C2F52756E67584D4C3E0D0A3C2F52756E67733E0B");
		String ladderXml = new String(array);
		return ladderXml;
	}

	public static String create(String sysmacLadderXml) {
		sysmacLadderXml = fixXmlLenghtIssue(sysmacLadderXml);

		StringBuilder data = new StringBuilder();
		data.append(createPrefix());
		data.append(createLength(sysmacLadderXml));
		data.append(sysmacLadderXml);
		data.append(createSuffix());

		return data.toString();
	}

	/**
	 * Apparently low byte shifts one bit to the right!!!<br>
	 * Omron has Strange Japanese programmers
	 * 
	 * @param sysmacLadderXml
	 * @return
	 */
	private static String createLength(String sysmacLadderXml) {
//		int xmlLength = sysmacLadderXml.length() * 2;
//		byte lengthLowByte = (byte) (((xmlLength % 256) / 2) + 128);
//		byte lengthHighByte = (byte) (xmlLength / 256);
//		byte[] length = new byte[] { lengthLowByte, lengthHighByte };
	
		int xmlLength = sysmacLadderXml.length();

		ByteBuffer byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 128);
		byte b7 = byteBuffer.array()[0];

		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 64);
		byte b6 = byteBuffer.array()[1];

		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 32);
		byte b5 = byteBuffer.array()[2];
		
		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength *16);
		byte b4 = byteBuffer.array()[3];
		
		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 8);
		byte b3 = byteBuffer.array()[4];

		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 4);
		byte b2 = byteBuffer.array()[5];

		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength * 2);
		byte b1 = byteBuffer.array()[6];
		
		byteBuffer = ByteBuffer.allocate(8);
		byteBuffer.putLong(xmlLength);
		byte b0 = byteBuffer.array()[7];
		
		
		if (b7!=0) {//numBytes=8;
			//add sign bits when there is a higher byte 
			b6=(byte) (b6|MOST_SIGNIFICANT_BIT);
			b5=(byte) (b5|MOST_SIGNIFICANT_BIT);
			b4=(byte) (b4|MOST_SIGNIFICANT_BIT);
			b3=(byte) (b3|MOST_SIGNIFICANT_BIT);
			b2=(byte) (b2|MOST_SIGNIFICANT_BIT);
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String( new byte[] {b0, b1, b2, b3, b4, b5, b6, b7});
		} else if (b6!=0) {//numBytes=7;
			//add sign bits when there is a higher byte 
			b5=(byte) (b5|MOST_SIGNIFICANT_BIT);
			b4=(byte) (b4|MOST_SIGNIFICANT_BIT);
			b3=(byte) (b3|MOST_SIGNIFICANT_BIT);
			b2=(byte) (b2|MOST_SIGNIFICANT_BIT);
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String( new byte[] {b0, b1, b2, b3, b4, b5, b6});
		} else if (b5!=0) {//numBytes=6;
			//add sign bits when there is a higher byte 
			b4=(byte) (b4|MOST_SIGNIFICANT_BIT);
			b3=(byte) (b3|MOST_SIGNIFICANT_BIT);
			b2=(byte) (b2|MOST_SIGNIFICANT_BIT);
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String( new byte[] {b0, b1, b2, b3, b4, b5});
		} else if (b4!=0) {//numBytes=5;
			//add sign bits when there is a higher byte 
			b3=(byte) (b3|MOST_SIGNIFICANT_BIT);
			b2=(byte) (b2|MOST_SIGNIFICANT_BIT);
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String( new byte[] {b0, b1, b2, b3, b4});
		} else if (b3!=0) {//numBytes=4;
			//add sign bits when there is a higher byte 
			b2=(byte) (b2|MOST_SIGNIFICANT_BIT);
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String( new byte[] {b0, b1, b2, b3});
		} else if (b2!=0) {//numBytes=3;
			//add sign bits when there is a higher byte 
			b1=(byte) (b1|MOST_SIGNIFICANT_BIT);
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String(  new byte[] {b0, b1, b2});
		} else if (b1!=0) {//numBytes=2;
			//add sign bits when there is a higher byte 
			b0=(byte) (b0|MOST_SIGNIFICANT_BIT);
			return new String(  new byte[] {b0, b1});
		}else  {//numBytes=1
			return new String(  new byte[] {b0});
		}
	}

	private static String createSuffix() {
		byte[] suffix = DatatypeConverter.parseHexBinary("0B");
		return new String(suffix);
	}

	public static String createPrefix() {
		byte[] prefix = DatatypeConverter.parseHexBinary(
				"96A79EFD133B7043A67956106BB288FB0001000000FFFFFFFF01000000000000000601000000");
		return new String(prefix);
	}

	/**
	 * Seems to be necessary to extend the XML message with a space is some
	 * conditions, otherwise Sysmac does not recognize the clip board as
	 * valid... Likely to do with the strange XML length calculation we need to
	 * add to the data.
	 *
	 * @param sysmacLadderXml
	 * @return
	 */
	private static String fixXmlLenghtIssue(String sysmacLadderXml) {
//		System.out.println(sysmacLadderXml.length());
//		if (sysmacLadderXml.length() == 2305 || sysmacLadderXml.length() == 2319
//				|| sysmacLadderXml.length() == 9089 ||sysmacLadderXml.length()==34166) {
//				sysmacLadderXml = sysmacLadderXml + "  ";
//		}
		return sysmacLadderXml;
	}
}

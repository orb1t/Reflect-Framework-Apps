package nth.meyn.cx.sysmac.converter.sysmac.ladder.xml.factory;

import java.util.Arrays;
import java.util.List;

public class InstructionPlusFactory extends InstructionCalculationFactory {

	private static final String LONG_SUFFIX = "L";
	
	public InstructionPlusFactory() {
		super("+");
	}
	
	@Override
	public List<String> getNameSuffixes() {
		return Arrays.asList( LONG_SUFFIX); 
	}

}

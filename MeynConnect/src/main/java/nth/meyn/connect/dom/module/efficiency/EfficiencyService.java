package nth.meyn.connect.dom.module.efficiency;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import nth.introspect.layer5provider.reflection.behavior.displayname.DisplayName;
import nth.introspect.layer5provider.reflection.behavior.executionmode.ExecutionMode;
import nth.introspect.layer5provider.reflection.behavior.executionmode.ExecutionModeType;
import nth.introspect.layer5provider.reflection.behavior.icon.Icon;
import nth.introspect.layer5provider.reflection.behavior.order.Order;
import nth.introspect.layer5provider.reflection.behavior.parameterfactory.ParameterFactory;
import nth.introspect.ui.style.fontawesome.FontAwesomeUrl;
import nth.meyn.connect.dom.asset.Asset;

@Icon(iconURL=FontAwesomeUrl.LINE_CHART)
@DisplayName(englishName = "Efficiency")
public class EfficiencyService {

	@Order(sequenceNumber=10)
	public List<EfficiencyOverview> efficiencyOverviews() {
		return EfficiencyOverviewExampleFactory.create();
	}

	@Order(sequenceNumber=20)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public EfficiencyGraph efficiencyGraph(EfficiencyOverview efficiencyOverview) {
		return efficiencyGraph(efficiencyOverview.getAsset());
	}
	
	@Order(sequenceNumber=21)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public EfficiencyGraph efficiencyGraph(Asset asset) {
		return new EfficiencyGraph();
	}
	
	@Order(sequenceNumber=31)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public TroughputGraph troughputGraph(EfficiencyOverview efficiencyOverview) {
		return troughputGraph(efficiencyOverview.getAsset());
	}
	
	@Order(sequenceNumber=32)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public TroughputGraph troughputGraph(Asset asset) {
		return new TroughputGraph();
	}


	@Order(sequenceNumber=41)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public List<EfficiencyIssue> efficiencyIssues(EfficiencyOverview efficiencyOverview) {
		return efficiencyIssues(efficiencyOverview.getAsset());
	}
	
	@Order(sequenceNumber=42)
	@ExecutionMode(mode=ExecutionModeType.EXECUTE_METHOD_DIRECTLY)
	public List<EfficiencyIssue> efficiencyIssues(Asset asset) {
		return new ArrayList<>();
	}

	@ParameterFactory
	public List<EfficiencyIssue> efficiencyIssues(EfficiencyIssueFilter efficiencyIssueFilter) {
		return new ArrayList<>();
	}

}
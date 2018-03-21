package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.rDsl.AltText;
import org.xtext.example.mydsl.rDsl.Axe;
import org.xtext.example.mydsl.rDsl.Body;
import org.xtext.example.mydsl.rDsl.Bookmark;
import org.xtext.example.mydsl.rDsl.BooleanLiteral;
import org.xtext.example.mydsl.rDsl.Border;
import org.xtext.example.mydsl.rDsl.BorderLine;
import org.xtext.example.mydsl.rDsl.BorderSide;
import org.xtext.example.mydsl.rDsl.BorderWidth;
import org.xtext.example.mydsl.rDsl.Cell;
import org.xtext.example.mydsl.rDsl.Chart;
import org.xtext.example.mydsl.rDsl.ChartElementProperties;
import org.xtext.example.mydsl.rDsl.ChartGrid;
import org.xtext.example.mydsl.rDsl.ColorPalette;
import org.xtext.example.mydsl.rDsl.Column;
import org.xtext.example.mydsl.rDsl.ComputedDatasetField;
import org.xtext.example.mydsl.rDsl.CrossTable;
import org.xtext.example.mydsl.rDsl.Dataset;
import org.xtext.example.mydsl.rDsl.Datasets;
import org.xtext.example.mydsl.rDsl.Datasource;
import org.xtext.example.mydsl.rDsl.DatasourceCSV;
import org.xtext.example.mydsl.rDsl.DatasourceJDBC;
import org.xtext.example.mydsl.rDsl.DatasourceSample;
import org.xtext.example.mydsl.rDsl.Datasources;
import org.xtext.example.mydsl.rDsl.Display;
import org.xtext.example.mydsl.rDsl.DynamicParameterValue;
import org.xtext.example.mydsl.rDsl.DynamicParameterValues;
import org.xtext.example.mydsl.rDsl.DynamicText;
import org.xtext.example.mydsl.rDsl.ElementProperty;
import org.xtext.example.mydsl.rDsl.FloatLiteral;
import org.xtext.example.mydsl.rDsl.Font;
import org.xtext.example.mydsl.rDsl.FontSize;
import org.xtext.example.mydsl.rDsl.Grid;
import org.xtext.example.mydsl.rDsl.HAlignment;
import org.xtext.example.mydsl.rDsl.Height;
import org.xtext.example.mydsl.rDsl.HexColor;
import org.xtext.example.mydsl.rDsl.HideAll;
import org.xtext.example.mydsl.rDsl.HideForMore;
import org.xtext.example.mydsl.rDsl.HideForOne;
import org.xtext.example.mydsl.rDsl.ID;
import org.xtext.example.mydsl.rDsl.Image;
import org.xtext.example.mydsl.rDsl.IndentSide;
import org.xtext.example.mydsl.rDsl.IndentValue;
import org.xtext.example.mydsl.rDsl.IntLiteral;
import org.xtext.example.mydsl.rDsl.JSExpression;
import org.xtext.example.mydsl.rDsl.Label;
import org.xtext.example.mydsl.rDsl.LabelProperties;
import org.xtext.example.mydsl.rDsl.Legend;
import org.xtext.example.mydsl.rDsl.LegendVisibility;
import org.xtext.example.mydsl.rDsl.Line;
import org.xtext.example.mydsl.rDsl.List;
import org.xtext.example.mydsl.rDsl.NullLiteral;
import org.xtext.example.mydsl.rDsl.PageBreak;
import org.xtext.example.mydsl.rDsl.PageProperties;
import org.xtext.example.mydsl.rDsl.PageSetup;
import org.xtext.example.mydsl.rDsl.Parameter;
import org.xtext.example.mydsl.rDsl.Parameters;
import org.xtext.example.mydsl.rDsl.Place;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.Report;
import org.xtext.example.mydsl.rDsl.RgbColor;
import org.xtext.example.mydsl.rDsl.Root;
import org.xtext.example.mydsl.rDsl.Row;
import org.xtext.example.mydsl.rDsl.SimpleDatasetField;
import org.xtext.example.mydsl.rDsl.SizeValue;
import org.xtext.example.mydsl.rDsl.SizeValuePercent;
import org.xtext.example.mydsl.rDsl.SizeValueUnit;
import org.xtext.example.mydsl.rDsl.StaticParameterValue;
import org.xtext.example.mydsl.rDsl.StaticParameterValues;
import org.xtext.example.mydsl.rDsl.StringColor;
import org.xtext.example.mydsl.rDsl.StringLiteral;
import org.xtext.example.mydsl.rDsl.Style;
import org.xtext.example.mydsl.rDsl.StyleRef;
import org.xtext.example.mydsl.rDsl.Styles;
import org.xtext.example.mydsl.rDsl.Table;
import org.xtext.example.mydsl.rDsl.Text;
import org.xtext.example.mydsl.rDsl.TextStyle;
import org.xtext.example.mydsl.rDsl.Tick;
import org.xtext.example.mydsl.rDsl.Title;
import org.xtext.example.mydsl.rDsl.Toc;
import org.xtext.example.mydsl.rDsl.VAlignment;
import org.xtext.example.mydsl.rDsl.Visibility;
import org.xtext.example.mydsl.rDsl.Whitespace;
import org.xtext.example.mydsl.rDsl.Width;
import org.xtext.example.mydsl.rDsl.WidthTypeValue;
import org.xtext.example.mydsl.rDsl.XAxe;
import org.xtext.example.mydsl.rDsl.YAxe;
import org.xtext.example.mydsl.rDsl.elementProperties;
import org.xtext.example.mydsl.rDsl.xData;
import org.xtext.example.mydsl.services.RDslGrammarAccess;

@SuppressWarnings("all")
public class RDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RDslPackage.ALT_TEXT:
				if(context == grammarAccess.getAltTextRule()) {
					sequence_AltText(context, (AltText) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.AXE:
				if(context == grammarAccess.getAxeRule()) {
					sequence_Axe(context, (Axe) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BOOKMARK:
				if(context == grammarAccess.getBookmarkRule()) {
					sequence_Bookmark(context, (Bookmark) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BORDER:
				if(context == grammarAccess.getBorderRule()) {
					sequence_Border(context, (Border) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BORDER_LINE:
				if(context == grammarAccess.getBorderAllRule() ||
				   context == grammarAccess.getBorderLineRule()) {
					sequence_BorderLine(context, (BorderLine) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BORDER_SIDE:
				if(context == grammarAccess.getBorderSideRule()) {
					sequence_BorderSide(context, (BorderSide) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.BORDER_WIDTH:
				if(context == grammarAccess.getBorderWidthRule()) {
					sequence_BorderWidth(context, (BorderWidth) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.CELL:
				if(context == grammarAccess.getCellRule()) {
					sequence_Cell(context, (Cell) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.CHART:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getChartRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_Chart(context, (Chart) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.CHART_ELEMENT_PROPERTIES:
				if(context == grammarAccess.getChartElementPropertiesRule()) {
					sequence_ChartElementProperties(context, (ChartElementProperties) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.CHART_GRID:
				if(context == grammarAccess.getChartGridRule()) {
					sequence_ChartGrid(context, (ChartGrid) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.COLOR_PALETTE:
				if(context == grammarAccess.getColorPaletteRule()) {
					sequence_ColorPalette(context, (ColorPalette) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.COMPUTED_DATASET_FIELD:
				if(context == grammarAccess.getComputedDatasetFieldRule() ||
				   context == grammarAccess.getDatasetFieldRule()) {
					sequence_ComputedDatasetField(context, (ComputedDatasetField) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.CROSS_TABLE:
				if(context == grammarAccess.getComplexElementsRule() ||
				   context == grammarAccess.getCrossTableRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_CrossTable(context, (CrossTable) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASET:
				if(context == grammarAccess.getDatasetRule()) {
					sequence_Dataset(context, (Dataset) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASETS:
				if(context == grammarAccess.getDatasetsRule()) {
					sequence_Datasets(context, (Datasets) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASOURCE:
				if(context == grammarAccess.getDatasourceRule()) {
					sequence_Datasource(context, (Datasource) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASOURCE_CSV:
				if(context == grammarAccess.getDatasourceCSVRule()) {
					sequence_DatasourceCSV(context, (DatasourceCSV) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASOURCE_JDBC:
				if(context == grammarAccess.getDatasourceJDBCRule()) {
					sequence_DatasourceJDBC(context, (DatasourceJDBC) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASOURCE_SAMPLE:
				if(context == grammarAccess.getDatasourceSampleRule()) {
					sequence_DatasourceSample(context, (DatasourceSample) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DATASOURCES:
				if(context == grammarAccess.getDatasourcesRule()) {
					sequence_Datasources(context, (Datasources) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DISPLAY:
				if(context == grammarAccess.getDisplayRule()) {
					sequence_Display(context, (Display) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DYNAMIC_PARAMETER_VALUE:
				if(context == grammarAccess.getDynamicParameterValueRule()) {
					sequence_DynamicParameterValue(context, (DynamicParameterValue) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DYNAMIC_PARAMETER_VALUES:
				if(context == grammarAccess.getDynamicParameterValuesRule() ||
				   context == grammarAccess.getParameterValueRule()) {
					sequence_DynamicParameterValues(context, (DynamicParameterValues) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.DYNAMIC_TEXT:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getDynamicTextRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_DynamicText(context, (DynamicText) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.ELEMENT_PROPERTY:
				if(context == grammarAccess.getElementPropertyRule()) {
					sequence_ElementProperty(context, (ElementProperty) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.FLOAT_LITERAL:
				if(context == grammarAccess.getFloatLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.FONT:
				if(context == grammarAccess.getFontRule()) {
					sequence_Font(context, (Font) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.FONT_SIZE:
				if(context == grammarAccess.getFontSizeRule()) {
					sequence_FontSize(context, (FontSize) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.GRID:
				if(context == grammarAccess.getComplexElementsRule() ||
				   context == grammarAccess.getGridRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_Grid(context, (Grid) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HALIGNMENT:
				if(context == grammarAccess.getHAlignmentRule()) {
					sequence_HAlignment(context, (HAlignment) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HEIGHT:
				if(context == grammarAccess.getHeightRule()) {
					sequence_Height(context, (Height) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HEX_COLOR:
				if(context == grammarAccess.getBackgroundColorRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getHexColorRule()) {
					sequence_HexColor(context, (HexColor) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HIDE_ALL:
				if(context == grammarAccess.getHideAllRule() ||
				   context == grammarAccess.getVisibilityRule()) {
					sequence_HideAll(context, (HideAll) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getHideForValueRule()) {
					sequence_HideForValue(context, (HideAll) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HIDE_FOR_MORE:
				if(context == grammarAccess.getHideForMoreRule() ||
				   context == grammarAccess.getVisibilityRule()) {
					sequence_HideForMore(context, (HideForMore) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.HIDE_FOR_ONE:
				if(context == grammarAccess.getHideForOneRule() ||
				   context == grammarAccess.getVisibilityRule()) {
					sequence_HideForOne(context, (HideForOne) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.ID:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (ID) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.IMAGE:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.INDENT_SIDE:
				if(context == grammarAccess.getIndentSideRule() ||
				   context == grammarAccess.getMarginRule() ||
				   context == grammarAccess.getPaddingRule()) {
					sequence_IndentSide(context, (IndentSide) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.INDENT_VALUE:
				if(context == grammarAccess.getIndentAllRule() ||
				   context == grammarAccess.getIndentValueRule() ||
				   context == grammarAccess.getMarginRule() ||
				   context == grammarAccess.getPaddingRule()) {
					sequence_IndentValue(context, (IndentValue) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.INT_LITERAL:
				if(context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.JS_EXPRESSION:
				if(context == grammarAccess.getJSExpressionRule()) {
					sequence_JSExpression(context, (JSExpression) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LABEL:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LABEL_PROPERTIES:
				if(context == grammarAccess.getLabelPropertiesRule()) {
					sequence_LabelProperties(context, (LabelProperties) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LEGEND:
				if(context == grammarAccess.getLegendRule()) {
					sequence_Legend(context, (Legend) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LEGEND_VISIBILITY:
				if(context == grammarAccess.getLegendVisibilityRule()) {
					sequence_LegendVisibility(context, (LegendVisibility) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LINE:
				if(context == grammarAccess.getLineRule()) {
					sequence_Line(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.LIST:
				if(context == grammarAccess.getComplexElementsRule() ||
				   context == grammarAccess.getListRule() ||
				   context == grammarAccess.getReportElementsRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PAGE_BREAK:
				if(context == grammarAccess.getPageBreakRule()) {
					sequence_PageBreak(context, (PageBreak) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PAGE_PROPERTIES:
				if(context == grammarAccess.getPagePropertiesRule()) {
					sequence_PageProperties(context, (PageProperties) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PAGE_SETUP:
				if(context == grammarAccess.getPageSetupRule()) {
					sequence_PageSetup(context, (PageSetup) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PARAMETERS:
				if(context == grammarAccess.getParametersRule()) {
					sequence_Parameters(context, (Parameters) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.PLACE:
				if(context == grammarAccess.getPlaceRule()) {
					sequence_Place(context, (Place) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.REPORT:
				if(context == grammarAccess.getReportRule()) {
					sequence_Report(context, (Report) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.RGB_COLOR:
				if(context == grammarAccess.getRgbColorRule()) {
					sequence_RgbColor(context, (RgbColor) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.ROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.ROW:
				if(context == grammarAccess.getRowRule()) {
					sequence_Row(context, (Row) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.SIMPLE_DATASET_FIELD:
				if(context == grammarAccess.getDatasetFieldRule() ||
				   context == grammarAccess.getSimpleDatasetFieldRule()) {
					sequence_SimpleDatasetField(context, (SimpleDatasetField) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.SIZE_VALUE:
				if(context == grammarAccess.getSizeValueRule()) {
					sequence_SizeValue(context, (SizeValue) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.SIZE_VALUE_PERCENT:
				if(context == grammarAccess.getSizeValuePercentRule()) {
					sequence_SizeValuePercent(context, (SizeValuePercent) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.SIZE_VALUE_UNIT:
				if(context == grammarAccess.getSizeValueUnitRule()) {
					sequence_SizeValueUnit(context, (SizeValueUnit) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STATIC_PARAMETER_VALUE:
				if(context == grammarAccess.getStaticParameterValueRule()) {
					sequence_StaticParameterValue(context, (StaticParameterValue) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STATIC_PARAMETER_VALUES:
				if(context == grammarAccess.getParameterValueRule() ||
				   context == grammarAccess.getStaticParameterValuesRule()) {
					sequence_StaticParameterValues(context, (StaticParameterValues) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STRING_COLOR:
				if(context == grammarAccess.getBackgroundColorRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getStringColorRule()) {
					sequence_StringColor(context, (StringColor) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STYLE_REF:
				if(context == grammarAccess.getStyleRefRule()) {
					sequence_StyleRef(context, (StyleRef) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.STYLES:
				if(context == grammarAccess.getStylesRule()) {
					sequence_Styles(context, (Styles) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TABLE:
				if(context == grammarAccess.getComplexElementsRule() ||
				   context == grammarAccess.getReportElementsRule() ||
				   context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TEXT:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getReportElementsRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TEXT_STYLE:
				if(context == grammarAccess.getTextStyleRule()) {
					sequence_TextStyle(context, (TextStyle) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TICK:
				if(context == grammarAccess.getTickRule()) {
					sequence_Tick(context, (Tick) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TITLE:
				if(context == grammarAccess.getTitleRule()) {
					sequence_Title(context, (Title) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.TOC:
				if(context == grammarAccess.getTocRule()) {
					sequence_Toc(context, (Toc) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.VALIGNMENT:
				if(context == grammarAccess.getVAlignmentRule()) {
					sequence_VAlignment(context, (VAlignment) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.VISIBILITY:
				if(context == grammarAccess.getVisibilityRule()) {
					sequence_Visibility(context, (Visibility) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.WHITESPACE:
				if(context == grammarAccess.getWhitespaceRule()) {
					sequence_Whitespace(context, (Whitespace) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.WIDTH:
				if(context == grammarAccess.getWidthRule()) {
					sequence_Width(context, (Width) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.WIDTH_TYPE_VALUE:
				if(context == grammarAccess.getWidthTypeValueRule()) {
					sequence_WidthTypeValue(context, (WidthTypeValue) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.XAXE:
				if(context == grammarAccess.getXAxeRule()) {
					sequence_XAxe(context, (XAxe) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.YAXE:
				if(context == grammarAccess.getYAxeRule()) {
					sequence_YAxe(context, (YAxe) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.ELEMENT_PROPERTIES:
				if(context == grammarAccess.getElementPropertiesRule()) {
					sequence_elementProperties(context, (elementProperties) semanticObject); 
					return; 
				}
				else break;
			case RDslPackage.XDATA:
				if(context == grammarAccess.getBasicElementsRule() ||
				   context == grammarAccess.getReportElementsRule() ||
				   context == grammarAccess.getXDataRule()) {
					sequence_xData(context, (xData) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     expression=JSExpression
	 */
	protected void sequence_AltText(EObject context, AltText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getAltText_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getAltText_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAltTextAccess().getExpressionJSExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (type='linear' | type='text' | type='logarithmic' | type='date-time') 
	 *         data=JSExpression 
	 *         groupingby=JSExpression? 
	 *         title=Title? 
	 *         line=Line? 
	 *         majorgrid=ChartGrid? 
	 *         minorgrid=ChartGrid?
	 *     )
	 */
	protected void sequence_Axe(EObject context, Axe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=ReportElements*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=JSExpression
	 */
	protected void sequence_Bookmark(EObject context, Bookmark semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getBookmark_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getBookmark_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBookmarkAccess().getExpressionJSExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=BorderLineStyleType width=BorderWidth color=Color)
	 */
	protected void sequence_BorderLine(EObject context, BorderLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (right=BorderLine? left=BorderLine? top=BorderLine? bottom=BorderLine?)
	 */
	protected void sequence_BorderSide(EObject context, BorderSide semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=WidthTypeValue | value=SizeValue)
	 */
	protected void sequence_BorderWidth(EObject context, BorderWidth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=BorderAll | value=BorderSide | linkto=[Border|ID]))
	 */
	protected void sequence_Border(EObject context, Border semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (order=INT? properties+=LabelProperties? elements+=ReportElements*)
	 */
	protected void sequence_Cell(EObject context, Cell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         padding=Padding? 
	 *         border=Border? 
	 *         visibility=Visibility? 
	 *         font=Font? 
	 *         fontSize=FontSize? 
	 *         color=Color? 
	 *         backgroundColor=BackgroundColor? 
	 *         textStyle=TextStyle? 
	 *         hAlign=HAlignment? 
	 *         vAlign=VAlignment? 
	 *         whiteSpace=Whitespace? 
	 *         style=StyleRef? 
	 *         display=Display?
	 *     )
	 */
	protected void sequence_ChartElementProperties(EObject context, ChartElementProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scale=INT value=BorderLine tick=Tick)
	 */
	protected void sequence_ChartGrid(EObject context, ChartGrid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ((type=ChartWithAxesType subtype=ChartSubType) | type=ChartWithoutAxesType) 
	 *         dataset=[Dataset|QualifiedName] 
	 *         (
	 *             properties+=LabelProperties 
	 *             title=Title? 
	 *             legend=Legend? 
	 *             plot=Plot? 
	 *             (axe=NoAxe | (xaxe=XAxe yaxe=YAxe)) 
	 *             colorpalette=ColorPalette?
	 *         )?
	 *     )
	 */
	protected void sequence_Chart(EObject context, Chart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? ((value+=StringColor | value+=HexColor | value+=RgbColor)+ | linkto=[ColorPalette|ID]))
	 */
	protected void sequence_ColorPalette(EObject context, ColorPalette semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (order=INT? properties+=LabelProperties?)
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID aggregation=AggregatorFunction datatype=DataType argument=JSExpression filter=JSExpression?)
	 */
	protected void sequence_ComputedDatasetField(EObject context, ComputedDatasetField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=LabelProperties?)
	 */
	protected void sequence_CrossTable(EObject context, CrossTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         datasourceref=[Datasource|QualifiedName] 
	 *         (field+=DatasetField field+=DatasetField*)? 
	 *         (parameter+=[Parameter|ID] parameter+=[Parameter|ID]*)? 
	 *         query=STRING?
	 *     )
	 */
	protected void sequence_Dataset(EObject context, Dataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dataset+=Dataset*
	 */
	protected void sequence_Datasets(EObject context, Datasets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=STRING charset=STRING delimiter=STRING headerline=BooleanLiteral)
	 */
	protected void sequence_DatasourceCSV(EObject context, DatasourceCSV semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (driver=STRING url=STRING user=STRING password=STRING)
	 */
	protected void sequence_DatasourceJDBC(EObject context, DatasourceJDBC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type='sample'
	 */
	protected void sequence_DatasourceSample(EObject context, DatasourceSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getDatasourceSample_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getDatasourceSample_Type()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDatasourceSampleAccess().getTypeSampleKeyword_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=DatasourceSample | type=DatasourceJDBC | type=DatasourceCSV))
	 */
	protected void sequence_Datasource(EObject context, Datasource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (datasource+=Datasource*)
	 */
	protected void sequence_Datasources(EObject context, Datasources semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=DisplayType | linkto=[Display|ID]))
	 */
	protected void sequence_Display(EObject context, Display semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dataset=[Dataset|ID] label=JSExpression value=JSExpression default+=JSExpression* (sort=[DatasetField|QualifiedName] sorttype=SortType)?)
	 */
	protected void sequence_DynamicParameterValue(EObject context, DynamicParameterValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value+=DynamicParameterValue
	 */
	protected void sequence_DynamicParameterValues(EObject context, DynamicParameterValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=JSExpression properties+=LabelProperties?)
	 */
	protected void sequence_DynamicText(EObject context, DynamicText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (colorpalette=ColorPalette? font=Font? fontSize=FontSize?)
	 */
	protected void sequence_ElementProperty(EObject context, ElementProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getFloatLiteral_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getFloatLiteral_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=SizeValueUnit | value=SizeValue | value=SizeValuePercent | linkto=[FontSize|ID]))
	 */
	protected void sequence_FontSize(EObject context, FontSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=STRING | linkto=[Font|ID]))
	 */
	protected void sequence_Font(EObject context, Font semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=LabelProperties? columns+=Column+ rows+=Row+)
	 */
	protected void sequence_Grid(EObject context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=HalignmentType | linkto=[HAlignment|ID]))
	 */
	protected void sequence_HAlignment(EObject context, HAlignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=IndentValue
	 */
	protected void sequence_Height(EObject context, Height semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getHeight_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getHeight_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeightAccess().getValueIndentValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=HEX_COLOR
	 */
	protected void sequence_HexColor(EObject context, HexColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getHexColor_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getHexColor_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHexColorAccess().getValueHEX_COLORTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=JSExpression
	 */
	protected void sequence_HideAll(EObject context, HideAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (format+=OutputFormatType+ expression=JSExpression?)
	 */
	protected void sequence_HideForMore(EObject context, HideForMore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value+=HideForValue+
	 */
	protected void sequence_HideForOne(EObject context, HideForOne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (format=OutputFormatType expression=JSExpression?)
	 */
	protected void sequence_HideForValue(EObject context, HideAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type='file' | type='url') content=JSExpression properties+=LabelProperties?)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (right=IndentValue? left=IndentValue? top=IndentValue? bottom=IndentValue?)
	 */
	protected void sequence_IndentSide(EObject context, IndentSide semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=SizeValue | value=SizeValuePercent)
	 */
	protected void sequence_IndentValue(EObject context, IndentValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getIntLiteral_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getIntLiteral_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Literal
	 */
	protected void sequence_JSExpression(EObject context, JSExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getJSExpression_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getJSExpression_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJSExpressionAccess().getValueLiteralParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         font=Font? 
	 *         fontSize=FontSize? 
	 *         color=Color? 
	 *         backgroundColor=BackgroundColor? 
	 *         textStyle=TextStyle? 
	 *         hAlign=HAlignment? 
	 *         vAlign=VAlignment? 
	 *         whiteSpace=Whitespace? 
	 *         style=StyleRef? 
	 *         display=Display? 
	 *         border=Border? 
	 *         padding=Padding? 
	 *         margin=Margin? 
	 *         visibility=Visibility? 
	 *         pagebreak=PageBreak? 
	 *         toc=Toc? 
	 *         bookmark=Bookmark? 
	 *         width=Width? 
	 *         height=Height? 
	 *         alttext=AltText?
	 *     )
	 */
	protected void sequence_LabelProperties(EObject context, LabelProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=STRING properties+=LabelProperties?)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='hide')
	 */
	protected void sequence_LegendVisibility(EObject context, LegendVisibility semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (place=Place orientation=OrientationType title=Title? visibility=LegendVisibility?)
	 */
	protected void sequence_Legend(EObject context, Legend semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BorderLine
	 */
	protected void sequence_Line(EObject context, Line semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getLine_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getLine_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLineAccess().getValueBorderLineParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=LabelProperties? headerelements+=ReportElements* detailelements+=ReportElements* footerelements+=ReportElements*)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[DatasetField|QualifiedName]
	 */
	protected void sequence_Literal(EObject context, ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getID_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getID_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueDatasetFieldQualifiedNameParserRuleCall_5_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (before=PageBreakValue? after=PageBreakValue? inside=PageBreakValue? interval=IntLiteral? repeat=BooleanLiteral?)
	 */
	protected void sequence_PageBreak(EObject context, PageBreak semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         font=Font? 
	 *         fontSize=FontSize? 
	 *         color=Color? 
	 *         backgroundColor=BackgroundColor? 
	 *         textStyle=TextStyle? 
	 *         hAlign=HAlignment? 
	 *         vAlign=VAlignment? 
	 *         whiteSpace=Whitespace? 
	 *         style=StyleRef? 
	 *         display=Display? 
	 *         border=Border? 
	 *         padding=Padding? 
	 *         margin=Margin? 
	 *         visibility=Visibility? 
	 *         pagebreak=PageBreak? 
	 *         toc=Toc? 
	 *         bookmark=Bookmark? 
	 *         width=Width? 
	 *         height=Height?
	 *     )
	 */
	protected void sequence_PageProperties(EObject context, PageProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     properties+=PageProperties?
	 */
	protected void sequence_PageSetup(EObject context, PageSetup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         controltype=ParameterControlType 
	 *         name=ID 
	 *         (
	 *             promt=STRING? 
	 *             help=STRING? 
	 *             hide=BooleanLiteral? 
	 *             required=BooleanLiteral? 
	 *             duplicate=BooleanLiteral? 
	 *             valuetype=ParameterValueType 
	 *             paramtype=ParameterType 
	 *             datatype=DataType 
	 *             values=ParameterValue
	 *         )?
	 *     )
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameter+=Parameter*
	 */
	protected void sequence_Parameters(EObject context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((position='left' | position='right') (anchor='top' | anchor='middle' | anchor='bottom')) | 
	 *         ((position='above' | position='below') (anchor='left' | anchor='middle' | anchor='right'))
	 *     )
	 */
	protected void sequence_Place(EObject context, Place semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         datasources=Datasources? 
	 *         datasets=Datasets? 
	 *         parameters=Parameters? 
	 *         styles=Styles? 
	 *         pagesetup=PageSetup? 
	 *         body=Body? 
	 *         elementProperties=elementProperties?
	 *     )
	 */
	protected void sequence_Report(EObject context, Report semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (r=INT g=INT b=INT)
	 */
	protected void sequence_RgbColor(EObject context, RgbColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getRgbColor_R()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getRgbColor_R()));
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getRgbColor_G()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getRgbColor_G()));
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getRgbColor_B()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getRgbColor_B()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRgbColorAccess().getRINTTerminalRuleCall_1_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getRgbColorAccess().getGINTTerminalRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getRgbColorAccess().getBINTTerminalRuleCall_3_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     root=Report
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getRoot_Root()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getRoot_Root()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootAccess().getRootReportParserRuleCall_0(), semanticObject.getRoot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (order=INT? properties+=LabelProperties? cells+=Cell+)
	 */
	protected void sequence_Row(EObject context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SimpleDatasetField(EObject context, SimpleDatasetField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getDatasetField_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getDatasetField_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleDatasetFieldAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_SizeValuePercent(EObject context, SizeValuePercent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getSizeValuePercent_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getSizeValuePercent_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeValuePercentAccess().getValueFLOATTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SizeUnit
	 */
	protected void sequence_SizeValueUnit(EObject context, SizeValueUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getSizeValueUnit_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getSizeValueUnit_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeValueUnitAccess().getValueSizeUnitEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=FLOAT unit=LengthUnit)
	 */
	protected void sequence_SizeValue(EObject context, SizeValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getSizeValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getSizeValue_Value()));
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getSizeValue_Unit()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getSizeValue_Unit()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeValueAccess().getValueFLOATTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSizeValueAccess().getUnitLengthUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=STRING value=STRING default?='default'?)
	 */
	protected void sequence_StaticParameterValue(EObject context, StaticParameterValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=StaticParameterValue* (sort=StaticParameterSort sorttype=SortType)?)
	 */
	protected void sequence_StaticParameterValues(EObject context, StaticParameterValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ColorType
	 */
	protected void sequence_StringColor(EObject context, StringColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getStringColor_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getStringColor_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringColorAccess().getValueColorTypeEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getStringLiteral_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getStringLiteral_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refname=[Style|ID]
	 */
	protected void sequence_StyleRef(EObject context, StyleRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getStyleRef_Refname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getStyleRef_Refname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleRefAccess().getRefnameStyleIDTerminalRuleCall_1_0_1(), semanticObject.getRefname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=LabelProperties?)
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     style+=Style*
	 */
	protected void sequence_Styles(EObject context, Styles semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         properties+=LabelProperties? 
	 *         dataset=[Dataset|QualifiedName]? 
	 *         columns+=Column+ 
	 *         headerrows+=Row* 
	 *         detailrows+=Row* 
	 *         footerrows+=Row*
	 *     )
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? I?='italic'? B?='bold'? U?='underline'? T?='through-line'?)
	 */
	protected void sequence_TextStyle(EObject context, TextStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=STRING properties+=LabelProperties?)
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((place='above' | place='across' | place='below') value=BorderLine?)
	 */
	protected void sequence_Tick(EObject context, Tick semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING (place='left' | place='right' | place='above' | place='below') properties=ChartElementProperties?)
	 */
	protected void sequence_Title(EObject context, Title semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=StyleRef? value=JSExpression)
	 */
	protected void sequence_Toc(EObject context, Toc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=ValignmentType | linkto=[VAlignment|ID]))
	 */
	protected void sequence_VAlignment(EObject context, VAlignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     show?='true'
	 */
	protected void sequence_Visibility(EObject context, Visibility semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getVisibility_Show()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getVisibility_Show()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVisibilityAccess().getShowTrueKeyword_1_0_0(), semanticObject.isShow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (value=WhitespaceType | linkto=[Whitespace|ID]))
	 */
	protected void sequence_Whitespace(EObject context, Whitespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=WidthType
	 */
	protected void sequence_WidthTypeValue(EObject context, WidthTypeValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getWidthTypeValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getWidthTypeValue_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWidthTypeValueAccess().getValueWidthTypeEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=IndentValue
	 */
	protected void sequence_Width(EObject context, Width semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getWidth_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getWidth_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWidthAccess().getValueIndentValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Axe
	 */
	protected void sequence_XAxe(EObject context, XAxe semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getXAxe_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getXAxe_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXAxeAccess().getValueAxeParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Axe
	 */
	protected void sequence_YAxe(EObject context, YAxe semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RDslPackage.eINSTANCE.getYAxe_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RDslPackage.eINSTANCE.getYAxe_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getYAxeAccess().getValueAxeParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         properties+=Font | 
	 *         properties+=FontSize | 
	 *         properties+=ColorPalette | 
	 *         properties+=HAlignment | 
	 *         properties+=VAlignment | 
	 *         properties+=Whitespace | 
	 *         properties+=StyleRef | 
	 *         properties+=Display | 
	 *         properties+=Border | 
	 *         properties+=Padding | 
	 *         properties+=Margin | 
	 *         properties+=Visibility | 
	 *         properties+=PageBreak | 
	 *         properties+=Bookmark | 
	 *         properties+=Width | 
	 *         properties+=Height | 
	 *         properties+=AltText
	 *     )+
	 */
	protected void sequence_elementProperties(EObject context, elementProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=JSExpression properties+=LabelProperties?)
	 */
	protected void sequence_xData(EObject context, xData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

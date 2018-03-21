/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.rDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDslFactoryImpl extends EFactoryImpl implements RDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RDslFactory init()
  {
    try
    {
      RDslFactory theRDslFactory = (RDslFactory)EPackage.Registry.INSTANCE.getEFactory(RDslPackage.eNS_URI);
      if (theRDslFactory != null)
      {
        return theRDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RDslPackage.ROOT: return createRoot();
      case RDslPackage.REPORT: return createReport();
      case RDslPackage.ELEMENT_PROPERTIES: return createelementProperties();
      case RDslPackage.ELEMENT_PROPERTY: return createElementProperty();
      case RDslPackage.DATASOURCES: return createDatasources();
      case RDslPackage.DATASOURCE: return createDatasource();
      case RDslPackage.DATASOURCE_SAMPLE: return createDatasourceSample();
      case RDslPackage.DATASOURCE_JDBC: return createDatasourceJDBC();
      case RDslPackage.DATASOURCE_CSV: return createDatasourceCSV();
      case RDslPackage.DATASETS: return createDatasets();
      case RDslPackage.DATASET: return createDataset();
      case RDslPackage.DATASET_FIELD: return createDatasetField();
      case RDslPackage.SIMPLE_DATASET_FIELD: return createSimpleDatasetField();
      case RDslPackage.COMPUTED_DATASET_FIELD: return createComputedDatasetField();
      case RDslPackage.PARAMETERS: return createParameters();
      case RDslPackage.STATIC_PARAMETER_VALUES: return createStaticParameterValues();
      case RDslPackage.STATIC_PARAMETER_VALUE: return createStaticParameterValue();
      case RDslPackage.DYNAMIC_PARAMETER_VALUES: return createDynamicParameterValues();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE: return createDynamicParameterValue();
      case RDslPackage.PARAMETER: return createParameter();
      case RDslPackage.PARAMETER_VALUE: return createParameterValue();
      case RDslPackage.STYLES: return createStyles();
      case RDslPackage.PAGE_SETUP: return createPageSetup();
      case RDslPackage.BODY: return createBody();
      case RDslPackage.REPORT_ELEMENTS: return createReportElements();
      case RDslPackage.BASIC_ELEMENTS: return createBasicElements();
      case RDslPackage.COMPLEX_ELEMENTS: return createComplexElements();
      case RDslPackage.LABEL: return createLabel();
      case RDslPackage.TEXT: return createText();
      case RDslPackage.DYNAMIC_TEXT: return createDynamicText();
      case RDslPackage.XDATA: return createxData();
      case RDslPackage.IMAGE: return createImage();
      case RDslPackage.CHART: return createChart();
      case RDslPackage.LEGEND: return createLegend();
      case RDslPackage.XAXE: return createXAxe();
      case RDslPackage.YAXE: return createYAxe();
      case RDslPackage.AXE: return createAxe();
      case RDslPackage.LINE: return createLine();
      case RDslPackage.CHART_GRID: return createChartGrid();
      case RDslPackage.TICK: return createTick();
      case RDslPackage.COLOR_PALETTE: return createColorPalette();
      case RDslPackage.PLACE: return createPlace();
      case RDslPackage.TITLE: return createTitle();
      case RDslPackage.CHART_ELEMENT_PROPERTIES: return createChartElementProperties();
      case RDslPackage.LIST: return createList();
      case RDslPackage.GRID: return createGrid();
      case RDslPackage.TABLE: return createTable();
      case RDslPackage.CROSS_TABLE: return createCrossTable();
      case RDslPackage.COLUMN: return createColumn();
      case RDslPackage.ROW: return createRow();
      case RDslPackage.CELL: return createCell();
      case RDslPackage.PAGE_PROPERTIES: return createPageProperties();
      case RDslPackage.LABEL_PROPERTIES: return createLabelProperties();
      case RDslPackage.FONT: return createFont();
      case RDslPackage.FONT_SIZE: return createFontSize();
      case RDslPackage.SIZE_VALUE_UNIT: return createSizeValueUnit();
      case RDslPackage.SIZE_VALUE: return createSizeValue();
      case RDslPackage.SIZE_VALUE_PERCENT: return createSizeValuePercent();
      case RDslPackage.COLOR: return createColor();
      case RDslPackage.STRING_COLOR: return createStringColor();
      case RDslPackage.HEX_COLOR: return createHexColor();
      case RDslPackage.RGB_COLOR: return createRgbColor();
      case RDslPackage.TEXT_STYLE: return createTextStyle();
      case RDslPackage.HALIGNMENT: return createHAlignment();
      case RDslPackage.VALIGNMENT: return createVAlignment();
      case RDslPackage.WHITESPACE: return createWhitespace();
      case RDslPackage.DISPLAY: return createDisplay();
      case RDslPackage.BORDER: return createBorder();
      case RDslPackage.BORDER_ALL: return createBorderAll();
      case RDslPackage.BORDER_SIDE: return createBorderSide();
      case RDslPackage.BORDER_LINE: return createBorderLine();
      case RDslPackage.BORDER_WIDTH: return createBorderWidth();
      case RDslPackage.WIDTH_TYPE_VALUE: return createWidthTypeValue();
      case RDslPackage.PADDING: return createPadding();
      case RDslPackage.INDENT_ALL: return createIndentAll();
      case RDslPackage.INDENT_SIDE: return createIndentSide();
      case RDslPackage.INDENT_VALUE: return createIndentValue();
      case RDslPackage.PAGE_BREAK: return createPageBreak();
      case RDslPackage.VISIBILITY: return createVisibility();
      case RDslPackage.LEGEND_VISIBILITY: return createLegendVisibility();
      case RDslPackage.HIDE_ALL: return createHideAll();
      case RDslPackage.HIDE_FOR_ONE: return createHideForOne();
      case RDslPackage.HIDE_FOR_MORE: return createHideForMore();
      case RDslPackage.JS_EXPRESSION: return createJSExpression();
      case RDslPackage.TOC: return createToc();
      case RDslPackage.BOOKMARK: return createBookmark();
      case RDslPackage.STYLE_REF: return createStyleRef();
      case RDslPackage.STYLE: return createStyle();
      case RDslPackage.WIDTH: return createWidth();
      case RDslPackage.HEIGHT: return createHeight();
      case RDslPackage.ALT_TEXT: return createAltText();
      case RDslPackage.LITERAL: return createLiteral();
      case RDslPackage.INT_LITERAL: return createIntLiteral();
      case RDslPackage.FLOAT_LITERAL: return createFloatLiteral();
      case RDslPackage.STRING_LITERAL: return createStringLiteral();
      case RDslPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case RDslPackage.NULL_LITERAL: return createNullLiteral();
      case RDslPackage.ID: return createID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RDslPackage.STRING:
        return createSTRINGFromString(eDataType, initialValue);
      case RDslPackage.CHART_SUB_TYPE:
        return createChartSubTypeFromString(eDataType, initialValue);
      case RDslPackage.POSITION_TYPE:
        return createPositionTypeFromString(eDataType, initialValue);
      case RDslPackage.ORIENTATION_TYPE:
        return createOrientationTypeFromString(eDataType, initialValue);
      case RDslPackage.SIZE_UNIT:
        return createSizeUnitFromString(eDataType, initialValue);
      case RDslPackage.LENGTH_UNIT:
        return createLengthUnitFromString(eDataType, initialValue);
      case RDslPackage.HALIGNMENT_TYPE:
        return createHalignmentTypeFromString(eDataType, initialValue);
      case RDslPackage.VALIGNMENT_TYPE:
        return createValignmentTypeFromString(eDataType, initialValue);
      case RDslPackage.WHITESPACE_TYPE:
        return createWhitespaceTypeFromString(eDataType, initialValue);
      case RDslPackage.DISPLAY_TYPE:
        return createDisplayTypeFromString(eDataType, initialValue);
      case RDslPackage.BORDER_LINE_STYLE_TYPE:
        return createBorderLineStyleTypeFromString(eDataType, initialValue);
      case RDslPackage.WIDTH_TYPE:
        return createWidthTypeFromString(eDataType, initialValue);
      case RDslPackage.OUTPUT_FORMAT_TYPE:
        return createOutputFormatTypeFromString(eDataType, initialValue);
      case RDslPackage.PAGE_BREAK_TYPE:
        return createPageBreakTypeFromString(eDataType, initialValue);
      case RDslPackage.PAGE_BREAK_VALUE:
        return createPageBreakValueFromString(eDataType, initialValue);
      case RDslPackage.SORT_TYPE:
        return createSortTypeFromString(eDataType, initialValue);
      case RDslPackage.BORDER_TYPE:
        return createBorderTypeFromString(eDataType, initialValue);
      case RDslPackage.TARGET_TYPE:
        return createTargetTypeFromString(eDataType, initialValue);
      case RDslPackage.DRILL_THROUGH_TYPE:
        return createDrillThroughTypeFromString(eDataType, initialValue);
      case RDslPackage.COLOR_TYPE:
        return createColorTypeFromString(eDataType, initialValue);
      case RDslPackage.PARAMETER_CONTROL_TYPE:
        return createParameterControlTypeFromString(eDataType, initialValue);
      case RDslPackage.PARAMETER_VALUE_TYPE:
        return createParameterValueTypeFromString(eDataType, initialValue);
      case RDslPackage.PARAMETER_TYPE:
        return createParameterTypeFromString(eDataType, initialValue);
      case RDslPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      case RDslPackage.STATIC_PARAMETER_SORT:
        return createStaticParameterSortFromString(eDataType, initialValue);
      case RDslPackage.AGGREGATOR_FUNCTION:
        return createAggregatorFunctionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RDslPackage.STRING:
        return convertSTRINGToString(eDataType, instanceValue);
      case RDslPackage.CHART_SUB_TYPE:
        return convertChartSubTypeToString(eDataType, instanceValue);
      case RDslPackage.POSITION_TYPE:
        return convertPositionTypeToString(eDataType, instanceValue);
      case RDslPackage.ORIENTATION_TYPE:
        return convertOrientationTypeToString(eDataType, instanceValue);
      case RDslPackage.SIZE_UNIT:
        return convertSizeUnitToString(eDataType, instanceValue);
      case RDslPackage.LENGTH_UNIT:
        return convertLengthUnitToString(eDataType, instanceValue);
      case RDslPackage.HALIGNMENT_TYPE:
        return convertHalignmentTypeToString(eDataType, instanceValue);
      case RDslPackage.VALIGNMENT_TYPE:
        return convertValignmentTypeToString(eDataType, instanceValue);
      case RDslPackage.WHITESPACE_TYPE:
        return convertWhitespaceTypeToString(eDataType, instanceValue);
      case RDslPackage.DISPLAY_TYPE:
        return convertDisplayTypeToString(eDataType, instanceValue);
      case RDslPackage.BORDER_LINE_STYLE_TYPE:
        return convertBorderLineStyleTypeToString(eDataType, instanceValue);
      case RDslPackage.WIDTH_TYPE:
        return convertWidthTypeToString(eDataType, instanceValue);
      case RDslPackage.OUTPUT_FORMAT_TYPE:
        return convertOutputFormatTypeToString(eDataType, instanceValue);
      case RDslPackage.PAGE_BREAK_TYPE:
        return convertPageBreakTypeToString(eDataType, instanceValue);
      case RDslPackage.PAGE_BREAK_VALUE:
        return convertPageBreakValueToString(eDataType, instanceValue);
      case RDslPackage.SORT_TYPE:
        return convertSortTypeToString(eDataType, instanceValue);
      case RDslPackage.BORDER_TYPE:
        return convertBorderTypeToString(eDataType, instanceValue);
      case RDslPackage.TARGET_TYPE:
        return convertTargetTypeToString(eDataType, instanceValue);
      case RDslPackage.DRILL_THROUGH_TYPE:
        return convertDrillThroughTypeToString(eDataType, instanceValue);
      case RDslPackage.COLOR_TYPE:
        return convertColorTypeToString(eDataType, instanceValue);
      case RDslPackage.PARAMETER_CONTROL_TYPE:
        return convertParameterControlTypeToString(eDataType, instanceValue);
      case RDslPackage.PARAMETER_VALUE_TYPE:
        return convertParameterValueTypeToString(eDataType, instanceValue);
      case RDslPackage.PARAMETER_TYPE:
        return convertParameterTypeToString(eDataType, instanceValue);
      case RDslPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      case RDslPackage.STATIC_PARAMETER_SORT:
        return convertStaticParameterSortToString(eDataType, instanceValue);
      case RDslPackage.AGGREGATOR_FUNCTION:
        return convertAggregatorFunctionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementProperties createelementProperties()
  {
    elementPropertiesImpl elementProperties = new elementPropertiesImpl();
    return elementProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementProperty createElementProperty()
  {
    ElementPropertyImpl elementProperty = new ElementPropertyImpl();
    return elementProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasources createDatasources()
  {
    DatasourcesImpl datasources = new DatasourcesImpl();
    return datasources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasource createDatasource()
  {
    DatasourceImpl datasource = new DatasourceImpl();
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasourceSample createDatasourceSample()
  {
    DatasourceSampleImpl datasourceSample = new DatasourceSampleImpl();
    return datasourceSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasourceJDBC createDatasourceJDBC()
  {
    DatasourceJDBCImpl datasourceJDBC = new DatasourceJDBCImpl();
    return datasourceJDBC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasourceCSV createDatasourceCSV()
  {
    DatasourceCSVImpl datasourceCSV = new DatasourceCSVImpl();
    return datasourceCSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasets createDatasets()
  {
    DatasetsImpl datasets = new DatasetsImpl();
    return datasets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dataset createDataset()
  {
    DatasetImpl dataset = new DatasetImpl();
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasetField createDatasetField()
  {
    DatasetFieldImpl datasetField = new DatasetFieldImpl();
    return datasetField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleDatasetField createSimpleDatasetField()
  {
    SimpleDatasetFieldImpl simpleDatasetField = new SimpleDatasetFieldImpl();
    return simpleDatasetField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComputedDatasetField createComputedDatasetField()
  {
    ComputedDatasetFieldImpl computedDatasetField = new ComputedDatasetFieldImpl();
    return computedDatasetField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticParameterValues createStaticParameterValues()
  {
    StaticParameterValuesImpl staticParameterValues = new StaticParameterValuesImpl();
    return staticParameterValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticParameterValue createStaticParameterValue()
  {
    StaticParameterValueImpl staticParameterValue = new StaticParameterValueImpl();
    return staticParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicParameterValues createDynamicParameterValues()
  {
    DynamicParameterValuesImpl dynamicParameterValues = new DynamicParameterValuesImpl();
    return dynamicParameterValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicParameterValue createDynamicParameterValue()
  {
    DynamicParameterValueImpl dynamicParameterValue = new DynamicParameterValueImpl();
    return dynamicParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styles createStyles()
  {
    StylesImpl styles = new StylesImpl();
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageSetup createPageSetup()
  {
    PageSetupImpl pageSetup = new PageSetupImpl();
    return pageSetup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportElements createReportElements()
  {
    ReportElementsImpl reportElements = new ReportElementsImpl();
    return reportElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicElements createBasicElements()
  {
    BasicElementsImpl basicElements = new BasicElementsImpl();
    return basicElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexElements createComplexElements()
  {
    ComplexElementsImpl complexElements = new ComplexElementsImpl();
    return complexElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicText createDynamicText()
  {
    DynamicTextImpl dynamicText = new DynamicTextImpl();
    return dynamicText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public xData createxData()
  {
    xDataImpl xData = new xDataImpl();
    return xData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chart createChart()
  {
    ChartImpl chart = new ChartImpl();
    return chart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Legend createLegend()
  {
    LegendImpl legend = new LegendImpl();
    return legend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAxe createXAxe()
  {
    XAxeImpl xAxe = new XAxeImpl();
    return xAxe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAxe createYAxe()
  {
    YAxeImpl yAxe = new YAxeImpl();
    return yAxe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axe createAxe()
  {
    AxeImpl axe = new AxeImpl();
    return axe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartGrid createChartGrid()
  {
    ChartGridImpl chartGrid = new ChartGridImpl();
    return chartGrid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tick createTick()
  {
    TickImpl tick = new TickImpl();
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPalette createColorPalette()
  {
    ColorPaletteImpl colorPalette = new ColorPaletteImpl();
    return colorPalette;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace()
  {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartElementProperties createChartElementProperties()
  {
    ChartElementPropertiesImpl chartElementProperties = new ChartElementPropertiesImpl();
    return chartElementProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grid createGrid()
  {
    GridImpl grid = new GridImpl();
    return grid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrossTable createCrossTable()
  {
    CrossTableImpl crossTable = new CrossTableImpl();
    return crossTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Row createRow()
  {
    RowImpl row = new RowImpl();
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageProperties createPageProperties()
  {
    PagePropertiesImpl pageProperties = new PagePropertiesImpl();
    return pageProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelProperties createLabelProperties()
  {
    LabelPropertiesImpl labelProperties = new LabelPropertiesImpl();
    return labelProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font createFont()
  {
    FontImpl font = new FontImpl();
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSize createFontSize()
  {
    FontSizeImpl fontSize = new FontSizeImpl();
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValueUnit createSizeValueUnit()
  {
    SizeValueUnitImpl sizeValueUnit = new SizeValueUnitImpl();
    return sizeValueUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValue createSizeValue()
  {
    SizeValueImpl sizeValue = new SizeValueImpl();
    return sizeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeValuePercent createSizeValuePercent()
  {
    SizeValuePercentImpl sizeValuePercent = new SizeValuePercentImpl();
    return sizeValuePercent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringColor createStringColor()
  {
    StringColorImpl stringColor = new StringColorImpl();
    return stringColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HexColor createHexColor()
  {
    HexColorImpl hexColor = new HexColorImpl();
    return hexColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RgbColor createRgbColor()
  {
    RgbColorImpl rgbColor = new RgbColorImpl();
    return rgbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyle createTextStyle()
  {
    TextStyleImpl textStyle = new TextStyleImpl();
    return textStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HAlignment createHAlignment()
  {
    HAlignmentImpl hAlignment = new HAlignmentImpl();
    return hAlignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlignment createVAlignment()
  {
    VAlignmentImpl vAlignment = new VAlignmentImpl();
    return vAlignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Whitespace createWhitespace()
  {
    WhitespaceImpl whitespace = new WhitespaceImpl();
    return whitespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Display createDisplay()
  {
    DisplayImpl display = new DisplayImpl();
    return display;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border createBorder()
  {
    BorderImpl border = new BorderImpl();
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderAll createBorderAll()
  {
    BorderAllImpl borderAll = new BorderAllImpl();
    return borderAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderSide createBorderSide()
  {
    BorderSideImpl borderSide = new BorderSideImpl();
    return borderSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLine createBorderLine()
  {
    BorderLineImpl borderLine = new BorderLineImpl();
    return borderLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderWidth createBorderWidth()
  {
    BorderWidthImpl borderWidth = new BorderWidthImpl();
    return borderWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidthTypeValue createWidthTypeValue()
  {
    WidthTypeValueImpl widthTypeValue = new WidthTypeValueImpl();
    return widthTypeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Padding createPadding()
  {
    PaddingImpl padding = new PaddingImpl();
    return padding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentAll createIndentAll()
  {
    IndentAllImpl indentAll = new IndentAllImpl();
    return indentAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentSide createIndentSide()
  {
    IndentSideImpl indentSide = new IndentSideImpl();
    return indentSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentValue createIndentValue()
  {
    IndentValueImpl indentValue = new IndentValueImpl();
    return indentValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreak createPageBreak()
  {
    PageBreakImpl pageBreak = new PageBreakImpl();
    return pageBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibility()
  {
    VisibilityImpl visibility = new VisibilityImpl();
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegendVisibility createLegendVisibility()
  {
    LegendVisibilityImpl legendVisibility = new LegendVisibilityImpl();
    return legendVisibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideAll createHideAll()
  {
    HideAllImpl hideAll = new HideAllImpl();
    return hideAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideForOne createHideForOne()
  {
    HideForOneImpl hideForOne = new HideForOneImpl();
    return hideForOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideForMore createHideForMore()
  {
    HideForMoreImpl hideForMore = new HideForMoreImpl();
    return hideForMore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression createJSExpression()
  {
    JSExpressionImpl jsExpression = new JSExpressionImpl();
    return jsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Toc createToc()
  {
    TocImpl toc = new TocImpl();
    return toc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bookmark createBookmark()
  {
    BookmarkImpl bookmark = new BookmarkImpl();
    return bookmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleRef createStyleRef()
  {
    StyleRefImpl styleRef = new StyleRefImpl();
    return styleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Width createWidth()
  {
    WidthImpl width = new WidthImpl();
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height createHeight()
  {
    HeightImpl height = new HeightImpl();
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltText createAltText()
  {
    AltTextImpl altText = new AltTextImpl();
    return altText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ID createID()
  {
    IDImpl id = new IDImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRINGFromString(EDataType eDataType, String initialValue)
  {
    STRING result = STRING.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSTRINGToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartSubType createChartSubTypeFromString(EDataType eDataType, String initialValue)
  {
    ChartSubType result = ChartSubType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChartSubTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionType createPositionTypeFromString(EDataType eDataType, String initialValue)
  {
    PositionType result = PositionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPositionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrientationType createOrientationTypeFromString(EDataType eDataType, String initialValue)
  {
    OrientationType result = OrientationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOrientationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeUnit createSizeUnitFromString(EDataType eDataType, String initialValue)
  {
    SizeUnit result = SizeUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSizeUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthUnit createLengthUnitFromString(EDataType eDataType, String initialValue)
  {
    LengthUnit result = LengthUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLengthUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HalignmentType createHalignmentTypeFromString(EDataType eDataType, String initialValue)
  {
    HalignmentType result = HalignmentType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHalignmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValignmentType createValignmentTypeFromString(EDataType eDataType, String initialValue)
  {
    ValignmentType result = ValignmentType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValignmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhitespaceType createWhitespaceTypeFromString(EDataType eDataType, String initialValue)
  {
    WhitespaceType result = WhitespaceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWhitespaceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisplayType createDisplayTypeFromString(EDataType eDataType, String initialValue)
  {
    DisplayType result = DisplayType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDisplayTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLineStyleType createBorderLineStyleTypeFromString(EDataType eDataType, String initialValue)
  {
    BorderLineStyleType result = BorderLineStyleType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBorderLineStyleTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidthType createWidthTypeFromString(EDataType eDataType, String initialValue)
  {
    WidthType result = WidthType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWidthTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputFormatType createOutputFormatTypeFromString(EDataType eDataType, String initialValue)
  {
    OutputFormatType result = OutputFormatType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOutputFormatTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreakType createPageBreakTypeFromString(EDataType eDataType, String initialValue)
  {
    PageBreakType result = PageBreakType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPageBreakTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreakValue createPageBreakValueFromString(EDataType eDataType, String initialValue)
  {
    PageBreakValue result = PageBreakValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPageBreakValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortType createSortTypeFromString(EDataType eDataType, String initialValue)
  {
    SortType result = SortType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSortTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderType createBorderTypeFromString(EDataType eDataType, String initialValue)
  {
    BorderType result = BorderType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBorderTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetType createTargetTypeFromString(EDataType eDataType, String initialValue)
  {
    TargetType result = TargetType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTargetTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrillThroughType createDrillThroughTypeFromString(EDataType eDataType, String initialValue)
  {
    DrillThroughType result = DrillThroughType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDrillThroughTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorType createColorTypeFromString(EDataType eDataType, String initialValue)
  {
    ColorType result = ColorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterControlType createParameterControlTypeFromString(EDataType eDataType, String initialValue)
  {
    ParameterControlType result = ParameterControlType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterControlTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValueType createParameterValueTypeFromString(EDataType eDataType, String initialValue)
  {
    ParameterValueType result = ParameterValueType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterValueTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue)
  {
    ParameterType result = ParameterType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticParameterSort createStaticParameterSortFromString(EDataType eDataType, String initialValue)
  {
    StaticParameterSort result = StaticParameterSort.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStaticParameterSortToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregatorFunction createAggregatorFunctionFromString(EDataType eDataType, String initialValue)
  {
    AggregatorFunction result = AggregatorFunction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAggregatorFunctionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDslPackage getRDslPackage()
  {
    return (RDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RDslPackage getPackage()
  {
    return RDslPackage.eINSTANCE;
  }

} //RDslFactoryImpl

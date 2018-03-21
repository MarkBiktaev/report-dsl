/**
 */
package org.xtext.example.mydsl.rDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.rDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage
 * @generated
 */
public class RDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RDslPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.REPORT:
      {
        Report report = (Report)theEObject;
        T result = caseReport(report);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.ELEMENT_PROPERTIES:
      {
        elementProperties elementProperties = (elementProperties)theEObject;
        T result = caseelementProperties(elementProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.ELEMENT_PROPERTY:
      {
        ElementProperty elementProperty = (ElementProperty)theEObject;
        T result = caseElementProperty(elementProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASOURCES:
      {
        Datasources datasources = (Datasources)theEObject;
        T result = caseDatasources(datasources);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASOURCE:
      {
        Datasource datasource = (Datasource)theEObject;
        T result = caseDatasource(datasource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASOURCE_SAMPLE:
      {
        DatasourceSample datasourceSample = (DatasourceSample)theEObject;
        T result = caseDatasourceSample(datasourceSample);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASOURCE_JDBC:
      {
        DatasourceJDBC datasourceJDBC = (DatasourceJDBC)theEObject;
        T result = caseDatasourceJDBC(datasourceJDBC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASOURCE_CSV:
      {
        DatasourceCSV datasourceCSV = (DatasourceCSV)theEObject;
        T result = caseDatasourceCSV(datasourceCSV);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASETS:
      {
        Datasets datasets = (Datasets)theEObject;
        T result = caseDatasets(datasets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASET:
      {
        Dataset dataset = (Dataset)theEObject;
        T result = caseDataset(dataset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DATASET_FIELD:
      {
        DatasetField datasetField = (DatasetField)theEObject;
        T result = caseDatasetField(datasetField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.SIMPLE_DATASET_FIELD:
      {
        SimpleDatasetField simpleDatasetField = (SimpleDatasetField)theEObject;
        T result = caseSimpleDatasetField(simpleDatasetField);
        if (result == null) result = caseDatasetField(simpleDatasetField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.COMPUTED_DATASET_FIELD:
      {
        ComputedDatasetField computedDatasetField = (ComputedDatasetField)theEObject;
        T result = caseComputedDatasetField(computedDatasetField);
        if (result == null) result = caseDatasetField(computedDatasetField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PARAMETERS:
      {
        Parameters parameters = (Parameters)theEObject;
        T result = caseParameters(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STATIC_PARAMETER_VALUES:
      {
        StaticParameterValues staticParameterValues = (StaticParameterValues)theEObject;
        T result = caseStaticParameterValues(staticParameterValues);
        if (result == null) result = caseParameterValue(staticParameterValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STATIC_PARAMETER_VALUE:
      {
        StaticParameterValue staticParameterValue = (StaticParameterValue)theEObject;
        T result = caseStaticParameterValue(staticParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DYNAMIC_PARAMETER_VALUES:
      {
        DynamicParameterValues dynamicParameterValues = (DynamicParameterValues)theEObject;
        T result = caseDynamicParameterValues(dynamicParameterValues);
        if (result == null) result = caseParameterValue(dynamicParameterValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DYNAMIC_PARAMETER_VALUE:
      {
        DynamicParameterValue dynamicParameterValue = (DynamicParameterValue)theEObject;
        T result = caseDynamicParameterValue(dynamicParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PARAMETER_VALUE:
      {
        ParameterValue parameterValue = (ParameterValue)theEObject;
        T result = caseParameterValue(parameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STYLES:
      {
        Styles styles = (Styles)theEObject;
        T result = caseStyles(styles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PAGE_SETUP:
      {
        PageSetup pageSetup = (PageSetup)theEObject;
        T result = casePageSetup(pageSetup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.REPORT_ELEMENTS:
      {
        ReportElements reportElements = (ReportElements)theEObject;
        T result = caseReportElements(reportElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BASIC_ELEMENTS:
      {
        BasicElements basicElements = (BasicElements)theEObject;
        T result = caseBasicElements(basicElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.COMPLEX_ELEMENTS:
      {
        ComplexElements complexElements = (ComplexElements)theEObject;
        T result = caseComplexElements(complexElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseReportElements(label);
        if (result == null) result = caseBasicElements(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseReportElements(text);
        if (result == null) result = caseBasicElements(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DYNAMIC_TEXT:
      {
        DynamicText dynamicText = (DynamicText)theEObject;
        T result = caseDynamicText(dynamicText);
        if (result == null) result = caseReportElements(dynamicText);
        if (result == null) result = caseBasicElements(dynamicText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.XDATA:
      {
        xData xData = (xData)theEObject;
        T result = casexData(xData);
        if (result == null) result = caseReportElements(xData);
        if (result == null) result = caseBasicElements(xData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseReportElements(image);
        if (result == null) result = caseBasicElements(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.CHART:
      {
        Chart chart = (Chart)theEObject;
        T result = caseChart(chart);
        if (result == null) result = caseReportElements(chart);
        if (result == null) result = caseBasicElements(chart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LEGEND:
      {
        Legend legend = (Legend)theEObject;
        T result = caseLegend(legend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.XAXE:
      {
        XAxe xAxe = (XAxe)theEObject;
        T result = caseXAxe(xAxe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.YAXE:
      {
        YAxe yAxe = (YAxe)theEObject;
        T result = caseYAxe(yAxe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.AXE:
      {
        Axe axe = (Axe)theEObject;
        T result = caseAxe(axe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.CHART_GRID:
      {
        ChartGrid chartGrid = (ChartGrid)theEObject;
        T result = caseChartGrid(chartGrid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TICK:
      {
        Tick tick = (Tick)theEObject;
        T result = caseTick(tick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.COLOR_PALETTE:
      {
        ColorPalette colorPalette = (ColorPalette)theEObject;
        T result = caseColorPalette(colorPalette);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PLACE:
      {
        Place place = (Place)theEObject;
        T result = casePlace(place);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TITLE:
      {
        Title title = (Title)theEObject;
        T result = caseTitle(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.CHART_ELEMENT_PROPERTIES:
      {
        ChartElementProperties chartElementProperties = (ChartElementProperties)theEObject;
        T result = caseChartElementProperties(chartElementProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseReportElements(list);
        if (result == null) result = caseComplexElements(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.GRID:
      {
        Grid grid = (Grid)theEObject;
        T result = caseGrid(grid);
        if (result == null) result = caseReportElements(grid);
        if (result == null) result = caseComplexElements(grid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TABLE:
      {
        Table table = (Table)theEObject;
        T result = caseTable(table);
        if (result == null) result = caseReportElements(table);
        if (result == null) result = caseComplexElements(table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.CROSS_TABLE:
      {
        CrossTable crossTable = (CrossTable)theEObject;
        T result = caseCrossTable(crossTable);
        if (result == null) result = caseReportElements(crossTable);
        if (result == null) result = caseComplexElements(crossTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.ROW:
      {
        Row row = (Row)theEObject;
        T result = caseRow(row);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.CELL:
      {
        Cell cell = (Cell)theEObject;
        T result = caseCell(cell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PAGE_PROPERTIES:
      {
        PageProperties pageProperties = (PageProperties)theEObject;
        T result = casePageProperties(pageProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LABEL_PROPERTIES:
      {
        LabelProperties labelProperties = (LabelProperties)theEObject;
        T result = caseLabelProperties(labelProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.FONT:
      {
        Font font = (Font)theEObject;
        T result = caseFont(font);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.FONT_SIZE:
      {
        FontSize fontSize = (FontSize)theEObject;
        T result = caseFontSize(fontSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.SIZE_VALUE_UNIT:
      {
        SizeValueUnit sizeValueUnit = (SizeValueUnit)theEObject;
        T result = caseSizeValueUnit(sizeValueUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.SIZE_VALUE:
      {
        SizeValue sizeValue = (SizeValue)theEObject;
        T result = caseSizeValue(sizeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.SIZE_VALUE_PERCENT:
      {
        SizeValuePercent sizeValuePercent = (SizeValuePercent)theEObject;
        T result = caseSizeValuePercent(sizeValuePercent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STRING_COLOR:
      {
        StringColor stringColor = (StringColor)theEObject;
        T result = caseStringColor(stringColor);
        if (result == null) result = caseColor(stringColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HEX_COLOR:
      {
        HexColor hexColor = (HexColor)theEObject;
        T result = caseHexColor(hexColor);
        if (result == null) result = caseColor(hexColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.RGB_COLOR:
      {
        RgbColor rgbColor = (RgbColor)theEObject;
        T result = caseRgbColor(rgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TEXT_STYLE:
      {
        TextStyle textStyle = (TextStyle)theEObject;
        T result = caseTextStyle(textStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HALIGNMENT:
      {
        HAlignment hAlignment = (HAlignment)theEObject;
        T result = caseHAlignment(hAlignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.VALIGNMENT:
      {
        VAlignment vAlignment = (VAlignment)theEObject;
        T result = caseVAlignment(vAlignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.WHITESPACE:
      {
        Whitespace whitespace = (Whitespace)theEObject;
        T result = caseWhitespace(whitespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.DISPLAY:
      {
        Display display = (Display)theEObject;
        T result = caseDisplay(display);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BORDER:
      {
        Border border = (Border)theEObject;
        T result = caseBorder(border);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BORDER_ALL:
      {
        BorderAll borderAll = (BorderAll)theEObject;
        T result = caseBorderAll(borderAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BORDER_SIDE:
      {
        BorderSide borderSide = (BorderSide)theEObject;
        T result = caseBorderSide(borderSide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BORDER_LINE:
      {
        BorderLine borderLine = (BorderLine)theEObject;
        T result = caseBorderLine(borderLine);
        if (result == null) result = caseBorderAll(borderLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BORDER_WIDTH:
      {
        BorderWidth borderWidth = (BorderWidth)theEObject;
        T result = caseBorderWidth(borderWidth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.WIDTH_TYPE_VALUE:
      {
        WidthTypeValue widthTypeValue = (WidthTypeValue)theEObject;
        T result = caseWidthTypeValue(widthTypeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PADDING:
      {
        Padding padding = (Padding)theEObject;
        T result = casePadding(padding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.INDENT_ALL:
      {
        IndentAll indentAll = (IndentAll)theEObject;
        T result = caseIndentAll(indentAll);
        if (result == null) result = casePadding(indentAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.INDENT_SIDE:
      {
        IndentSide indentSide = (IndentSide)theEObject;
        T result = caseIndentSide(indentSide);
        if (result == null) result = casePadding(indentSide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.INDENT_VALUE:
      {
        IndentValue indentValue = (IndentValue)theEObject;
        T result = caseIndentValue(indentValue);
        if (result == null) result = caseIndentAll(indentValue);
        if (result == null) result = casePadding(indentValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.PAGE_BREAK:
      {
        PageBreak pageBreak = (PageBreak)theEObject;
        T result = casePageBreak(pageBreak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.VISIBILITY:
      {
        Visibility visibility = (Visibility)theEObject;
        T result = caseVisibility(visibility);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LEGEND_VISIBILITY:
      {
        LegendVisibility legendVisibility = (LegendVisibility)theEObject;
        T result = caseLegendVisibility(legendVisibility);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HIDE_ALL:
      {
        HideAll hideAll = (HideAll)theEObject;
        T result = caseHideAll(hideAll);
        if (result == null) result = caseVisibility(hideAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HIDE_FOR_ONE:
      {
        HideForOne hideForOne = (HideForOne)theEObject;
        T result = caseHideForOne(hideForOne);
        if (result == null) result = caseVisibility(hideForOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HIDE_FOR_MORE:
      {
        HideForMore hideForMore = (HideForMore)theEObject;
        T result = caseHideForMore(hideForMore);
        if (result == null) result = caseVisibility(hideForMore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.JS_EXPRESSION:
      {
        JSExpression jsExpression = (JSExpression)theEObject;
        T result = caseJSExpression(jsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.TOC:
      {
        Toc toc = (Toc)theEObject;
        T result = caseToc(toc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BOOKMARK:
      {
        Bookmark bookmark = (Bookmark)theEObject;
        T result = caseBookmark(bookmark);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STYLE_REF:
      {
        StyleRef styleRef = (StyleRef)theEObject;
        T result = caseStyleRef(styleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.WIDTH:
      {
        Width width = (Width)theEObject;
        T result = caseWidth(width);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.HEIGHT:
      {
        Height height = (Height)theEObject;
        T result = caseHeight(height);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.ALT_TEXT:
      {
        AltText altText = (AltText)theEObject;
        T result = caseAltText(altText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseLiteral(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.FLOAT_LITERAL:
      {
        FloatLiteral floatLiteral = (FloatLiteral)theEObject;
        T result = caseFloatLiteral(floatLiteral);
        if (result == null) result = caseLiteral(floatLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseLiteral(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseLiteral(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDslPackage.ID:
      {
        ID id = (ID)theEObject;
        T result = caseID(id);
        if (result == null) result = caseLiteral(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReport(Report object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelementProperties(elementProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementProperty(ElementProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasources</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasources</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasources(Datasources object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasource(Datasource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource Sample</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource Sample</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasourceSample(DatasourceSample object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource JDBC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource JDBC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasourceJDBC(DatasourceJDBC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource CSV</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource CSV</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasourceCSV(DatasourceCSV object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasets(Datasets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataset(Dataset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataset Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasetField(DatasetField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Dataset Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleDatasetField(SimpleDatasetField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Computed Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Computed Dataset Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComputedDatasetField(ComputedDatasetField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameters(Parameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Parameter Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Parameter Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticParameterValues(StaticParameterValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticParameterValue(StaticParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Parameter Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Parameter Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicParameterValues(DynamicParameterValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicParameterValue(DynamicParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterValue(ParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Styles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Styles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyles(Styles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Setup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Setup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageSetup(PageSetup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReportElements(ReportElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicElements(BasicElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexElements(ComplexElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicText(DynamicText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>xData</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>xData</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casexData(xData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChart(Chart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Legend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Legend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLegend(Legend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XAxe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XAxe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXAxe(XAxe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YAxe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YAxe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYAxe(YAxe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxe(Axe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chart Grid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chart Grid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChartGrid(ChartGrid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTick(Tick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Palette</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Palette</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorPalette(ColorPalette object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Place</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlace(Place object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitle(Title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chart Element Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chart Element Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChartElementProperties(ChartElementProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrid(Grid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTable(Table object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cross Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cross Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossTable(CrossTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRow(Row object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCell(Cell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageProperties(PageProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelProperties(LabelProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFont(Font object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontSize(FontSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Value Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Value Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeValueUnit(SizeValueUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeValue(SizeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Value Percent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Value Percent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeValuePercent(SizeValuePercent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringColor(StringColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hex Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hex Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexColor(HexColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rgb Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rgb Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRgbColor(RgbColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextStyle(TextStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HAlignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HAlignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHAlignment(HAlignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VAlignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VAlignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVAlignment(VAlignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Whitespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Whitespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhitespace(Whitespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Display</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisplay(Display object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorder(Border object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderAll(BorderAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Side</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Side</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderSide(BorderSide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderLine(BorderLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Width</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Width</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderWidth(BorderWidth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Width Type Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Width Type Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidthTypeValue(WidthTypeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Padding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Padding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePadding(Padding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indent All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indent All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndentAll(IndentAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indent Side</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indent Side</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndentSide(IndentSide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indent Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indent Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndentValue(IndentValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageBreak(PageBreak object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibility(Visibility object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Legend Visibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Legend Visibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLegendVisibility(LegendVisibility object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideAll(HideAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide For One</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide For One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideForOne(HideForOne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide For More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide For More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideForMore(HideForMore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JS Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JS Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSExpression(JSExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Toc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Toc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToc(Toc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bookmark</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bookmark</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookmark(Bookmark object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleRef(StyleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyle(Style object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Width</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Width</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidth(Width object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Height</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeight(Height object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alt Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alt Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAltText(AltText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatLiteral(FloatLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseID(ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RDslSwitch

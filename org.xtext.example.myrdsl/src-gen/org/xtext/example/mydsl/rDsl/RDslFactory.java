/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage
 * @generated
 */
public interface RDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RDslFactory eINSTANCE = org.xtext.example.mydsl.rDsl.impl.RDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report</em>'.
   * @generated
   */
  Report createReport();

  /**
   * Returns a new object of class '<em>element Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element Properties</em>'.
   * @generated
   */
  elementProperties createelementProperties();

  /**
   * Returns a new object of class '<em>Element Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Property</em>'.
   * @generated
   */
  ElementProperty createElementProperty();

  /**
   * Returns a new object of class '<em>Datasources</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasources</em>'.
   * @generated
   */
  Datasources createDatasources();

  /**
   * Returns a new object of class '<em>Datasource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasource</em>'.
   * @generated
   */
  Datasource createDatasource();

  /**
   * Returns a new object of class '<em>Datasource Sample</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasource Sample</em>'.
   * @generated
   */
  DatasourceSample createDatasourceSample();

  /**
   * Returns a new object of class '<em>Datasource JDBC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasource JDBC</em>'.
   * @generated
   */
  DatasourceJDBC createDatasourceJDBC();

  /**
   * Returns a new object of class '<em>Datasource CSV</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasource CSV</em>'.
   * @generated
   */
  DatasourceCSV createDatasourceCSV();

  /**
   * Returns a new object of class '<em>Datasets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasets</em>'.
   * @generated
   */
  Datasets createDatasets();

  /**
   * Returns a new object of class '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dataset</em>'.
   * @generated
   */
  Dataset createDataset();

  /**
   * Returns a new object of class '<em>Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dataset Field</em>'.
   * @generated
   */
  DatasetField createDatasetField();

  /**
   * Returns a new object of class '<em>Simple Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Dataset Field</em>'.
   * @generated
   */
  SimpleDatasetField createSimpleDatasetField();

  /**
   * Returns a new object of class '<em>Computed Dataset Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Computed Dataset Field</em>'.
   * @generated
   */
  ComputedDatasetField createComputedDatasetField();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>Static Parameter Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Parameter Values</em>'.
   * @generated
   */
  StaticParameterValues createStaticParameterValues();

  /**
   * Returns a new object of class '<em>Static Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Parameter Value</em>'.
   * @generated
   */
  StaticParameterValue createStaticParameterValue();

  /**
   * Returns a new object of class '<em>Dynamic Parameter Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Parameter Values</em>'.
   * @generated
   */
  DynamicParameterValues createDynamicParameterValues();

  /**
   * Returns a new object of class '<em>Dynamic Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Parameter Value</em>'.
   * @generated
   */
  DynamicParameterValue createDynamicParameterValue();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Value</em>'.
   * @generated
   */
  ParameterValue createParameterValue();

  /**
   * Returns a new object of class '<em>Styles</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Styles</em>'.
   * @generated
   */
  Styles createStyles();

  /**
   * Returns a new object of class '<em>Page Setup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Setup</em>'.
   * @generated
   */
  PageSetup createPageSetup();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Report Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report Elements</em>'.
   * @generated
   */
  ReportElements createReportElements();

  /**
   * Returns a new object of class '<em>Basic Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Elements</em>'.
   * @generated
   */
  BasicElements createBasicElements();

  /**
   * Returns a new object of class '<em>Complex Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Elements</em>'.
   * @generated
   */
  ComplexElements createComplexElements();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Dynamic Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Text</em>'.
   * @generated
   */
  DynamicText createDynamicText();

  /**
   * Returns a new object of class '<em>xData</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>xData</em>'.
   * @generated
   */
  xData createxData();

  /**
   * Returns a new object of class '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image</em>'.
   * @generated
   */
  Image createImage();

  /**
   * Returns a new object of class '<em>Chart</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chart</em>'.
   * @generated
   */
  Chart createChart();

  /**
   * Returns a new object of class '<em>Legend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Legend</em>'.
   * @generated
   */
  Legend createLegend();

  /**
   * Returns a new object of class '<em>XAxe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XAxe</em>'.
   * @generated
   */
  XAxe createXAxe();

  /**
   * Returns a new object of class '<em>YAxe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>YAxe</em>'.
   * @generated
   */
  YAxe createYAxe();

  /**
   * Returns a new object of class '<em>Axe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axe</em>'.
   * @generated
   */
  Axe createAxe();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Chart Grid</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chart Grid</em>'.
   * @generated
   */
  ChartGrid createChartGrid();

  /**
   * Returns a new object of class '<em>Tick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tick</em>'.
   * @generated
   */
  Tick createTick();

  /**
   * Returns a new object of class '<em>Color Palette</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Palette</em>'.
   * @generated
   */
  ColorPalette createColorPalette();

  /**
   * Returns a new object of class '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Place</em>'.
   * @generated
   */
  Place createPlace();

  /**
   * Returns a new object of class '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title</em>'.
   * @generated
   */
  Title createTitle();

  /**
   * Returns a new object of class '<em>Chart Element Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chart Element Properties</em>'.
   * @generated
   */
  ChartElementProperties createChartElementProperties();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid</em>'.
   * @generated
   */
  Grid createGrid();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Cross Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cross Table</em>'.
   * @generated
   */
  CrossTable createCrossTable();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row</em>'.
   * @generated
   */
  Row createRow();

  /**
   * Returns a new object of class '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell</em>'.
   * @generated
   */
  Cell createCell();

  /**
   * Returns a new object of class '<em>Page Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Properties</em>'.
   * @generated
   */
  PageProperties createPageProperties();

  /**
   * Returns a new object of class '<em>Label Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Properties</em>'.
   * @generated
   */
  LabelProperties createLabelProperties();

  /**
   * Returns a new object of class '<em>Font</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font</em>'.
   * @generated
   */
  Font createFont();

  /**
   * Returns a new object of class '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Size</em>'.
   * @generated
   */
  FontSize createFontSize();

  /**
   * Returns a new object of class '<em>Size Value Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Value Unit</em>'.
   * @generated
   */
  SizeValueUnit createSizeValueUnit();

  /**
   * Returns a new object of class '<em>Size Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Value</em>'.
   * @generated
   */
  SizeValue createSizeValue();

  /**
   * Returns a new object of class '<em>Size Value Percent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Value Percent</em>'.
   * @generated
   */
  SizeValuePercent createSizeValuePercent();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>String Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Color</em>'.
   * @generated
   */
  StringColor createStringColor();

  /**
   * Returns a new object of class '<em>Hex Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hex Color</em>'.
   * @generated
   */
  HexColor createHexColor();

  /**
   * Returns a new object of class '<em>Rgb Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rgb Color</em>'.
   * @generated
   */
  RgbColor createRgbColor();

  /**
   * Returns a new object of class '<em>Text Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Style</em>'.
   * @generated
   */
  TextStyle createTextStyle();

  /**
   * Returns a new object of class '<em>HAlignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HAlignment</em>'.
   * @generated
   */
  HAlignment createHAlignment();

  /**
   * Returns a new object of class '<em>VAlignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VAlignment</em>'.
   * @generated
   */
  VAlignment createVAlignment();

  /**
   * Returns a new object of class '<em>Whitespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Whitespace</em>'.
   * @generated
   */
  Whitespace createWhitespace();

  /**
   * Returns a new object of class '<em>Display</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Display</em>'.
   * @generated
   */
  Display createDisplay();

  /**
   * Returns a new object of class '<em>Border</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border</em>'.
   * @generated
   */
  Border createBorder();

  /**
   * Returns a new object of class '<em>Border All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border All</em>'.
   * @generated
   */
  BorderAll createBorderAll();

  /**
   * Returns a new object of class '<em>Border Side</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border Side</em>'.
   * @generated
   */
  BorderSide createBorderSide();

  /**
   * Returns a new object of class '<em>Border Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border Line</em>'.
   * @generated
   */
  BorderLine createBorderLine();

  /**
   * Returns a new object of class '<em>Border Width</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border Width</em>'.
   * @generated
   */
  BorderWidth createBorderWidth();

  /**
   * Returns a new object of class '<em>Width Type Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Width Type Value</em>'.
   * @generated
   */
  WidthTypeValue createWidthTypeValue();

  /**
   * Returns a new object of class '<em>Padding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Padding</em>'.
   * @generated
   */
  Padding createPadding();

  /**
   * Returns a new object of class '<em>Indent All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indent All</em>'.
   * @generated
   */
  IndentAll createIndentAll();

  /**
   * Returns a new object of class '<em>Indent Side</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indent Side</em>'.
   * @generated
   */
  IndentSide createIndentSide();

  /**
   * Returns a new object of class '<em>Indent Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indent Value</em>'.
   * @generated
   */
  IndentValue createIndentValue();

  /**
   * Returns a new object of class '<em>Page Break</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Break</em>'.
   * @generated
   */
  PageBreak createPageBreak();

  /**
   * Returns a new object of class '<em>Visibility</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibility</em>'.
   * @generated
   */
  Visibility createVisibility();

  /**
   * Returns a new object of class '<em>Legend Visibility</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Legend Visibility</em>'.
   * @generated
   */
  LegendVisibility createLegendVisibility();

  /**
   * Returns a new object of class '<em>Hide All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide All</em>'.
   * @generated
   */
  HideAll createHideAll();

  /**
   * Returns a new object of class '<em>Hide For One</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide For One</em>'.
   * @generated
   */
  HideForOne createHideForOne();

  /**
   * Returns a new object of class '<em>Hide For More</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide For More</em>'.
   * @generated
   */
  HideForMore createHideForMore();

  /**
   * Returns a new object of class '<em>JS Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JS Expression</em>'.
   * @generated
   */
  JSExpression createJSExpression();

  /**
   * Returns a new object of class '<em>Toc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Toc</em>'.
   * @generated
   */
  Toc createToc();

  /**
   * Returns a new object of class '<em>Bookmark</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bookmark</em>'.
   * @generated
   */
  Bookmark createBookmark();

  /**
   * Returns a new object of class '<em>Style Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Ref</em>'.
   * @generated
   */
  StyleRef createStyleRef();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Width</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Width</em>'.
   * @generated
   */
  Width createWidth();

  /**
   * Returns a new object of class '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Height</em>'.
   * @generated
   */
  Height createHeight();

  /**
   * Returns a new object of class '<em>Alt Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alt Text</em>'.
   * @generated
   */
  AltText createAltText();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID</em>'.
   * @generated
   */
  ID createID();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RDslPackage getRDslPackage();

} //RDslFactory

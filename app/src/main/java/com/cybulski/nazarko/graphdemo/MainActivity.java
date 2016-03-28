package com.cybulski.nazarko.graphdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleDataSet;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private CombinedChart mChart;
  private final int itemcount = 12;
  protected String[] mMonths = new String[] {
      "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"
  };


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mChart = (CombinedChart) findViewById(R.id.chart1);

    mChart.setDrawGridBackground(false);
    mChart.setDescription("");

    // scaling can now only be done on x- and y-axis separately
    mChart.setPinchZoom(false);

    mChart.setDrawBarShadow(false);
    mChart.setDrawValueAboveBar(true);

    mChart.getAxisLeft().setEnabled(false);
    mChart.getAxisRight().setAxisMaxValue(50f);
    mChart.getAxisRight().setAxisMinValue(-40f);
    mChart.getAxisRight().setDrawGridLines(false);
    mChart.getAxisRight().setDrawZeroLine(true);
    mChart.getAxisRight().setLabelCount(7, false);
    mChart.getAxisRight().setTextSize(9f);

    XAxis xAxis = mChart.getXAxis();
    xAxis.setPosition(XAxis.XAxisPosition.BOTH_SIDED);
    xAxis.setDrawGridLines(false);
    xAxis.setDrawAxisLine(false);
    xAxis.setTextSize(9f);

    Legend l = mChart.getLegend();
    l.setPosition(Legend.LegendPosition.BELOW_CHART_RIGHT);
    l.setFormSize(8f);
    l.setFormToTextSpace(4f);
    l.setXEntrySpace(6f);




    //BarData data = new BarData(mMonths, set);


    CombinedData data = new CombinedData(mMonths);

  //  data.setData(generateLineData());
    data.setData(generateBarData());


    mChart.setData(data);
    mChart.invalidate();


//    mChart.setBackgroundColor(Color.WHITE);
//    mChart.setExtraTopOffset(-30f);
//    mChart.setExtraBottomOffset(10f);
//    mChart.setExtraLeftOffset(70f);
//    mChart.setExtraRightOffset(70f);
//
//    mChart.setDrawBarShadow(false);
//    mChart.setDrawValueAboveBar(true);
//
//    mChart.setDescription("");
//
//    // scaling can now only be done on x- and y-axis separately
//    mChart.setPinchZoom(false);
//
//    mChart.setDrawGridBackground(false);
//
//    XAxis xAxis = mChart.getXAxis();
//    xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//    xAxis.setDrawGridLines(false);
//    xAxis.setDrawAxisLine(false);
//    xAxis.setSpaceBetweenLabels(2);
//    xAxis.setTextColor(Color.LTGRAY);
//    xAxis.setTextSize(13f);
//
//
//    YAxis left = mChart.getAxisLeft();
//    left.setDrawLabels(false);
//    left.setStartAtZero(false);
//    left.setSpaceTop(25f);
//    left.setSpaceBottom(25f);
//    left.setDrawAxisLine(false);
//    left.setDrawGridLines(false);
//    left.setAxisMaxValue(50f);
//    left.setAxisMinValue(-50f);
//    left.setDrawZeroLine(true); // draw a zero line
//    left.setZeroLineColor(Color.GRAY);
//    left.setZeroLineWidth(0.7f);
//    mChart.getAxisRight().setEnabled(false);
//    mChart.getLegend().setEnabled(false);




//    BarData data = new BarData(mMonths);
//
//    //data.setData(generateLineData());
//    data.setData(generateBarDataPlus());
//    data.setData(generateBarDataMinus());
//    //data.setData(generateBubbleData());
//    //data.setData(generateScatterData());
//    //data.setData(generateCandleData());
//
//
//
//
//    mChart.setData(data);
//    mChart.invalidate();



//    ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
//    for (int z = 0; z < 3; z++) {
//      ArrayList<BarEntry> values = new ArrayList<BarEntry>();
//
////      for (int i = 0; i < 12; i++) {
////        double val = (Math.random() * mSeekBarY.getProgress()) + 3;
////        values.add(new Entry((float) val, i));
////      }
//
//
//
//
//
//
//      BarDataSet d = new BarDataSet(values, "DataSet " + (z + 1));
//      dataSets.add(d);
//    }

//    dataSets.add(generateBarSetPlus());
//    dataSets.add(generateBarSetMinus());
//
//
//    BarData data1 = new BarData(mMonths, dataSets);
//    mChart.setData(data1);


//    ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();
//
//    for (int i = 0; i <12; i++) {
//      float mult = i ;
//      float val1 = (float) (Math.random() * mult) + mult / 3;
//      float val2 = (float) (Math.random() * mult) + mult / 3;
//      float val3 = (float) (Math.random() * mult) + mult / 3;
//
//      yVals1.add(new BarEntry(new float[] { val1, val2, val3 }, i));
//    }
//
//    BarDataSet set1 = new BarDataSet(yVals1, "Statistics Vienna 2014");
//    set1.setStackLabels(new String[]{"Births", "Divorces", "Marriages"});
//
//    ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
//    set1.setColors(getColors());
//    dataSets.add(set1);
//
//    BarData data = new BarData(mMonths, dataSets);
//    //data.setValueFormatter(new MyValueFormatter());
//
//    mChart.setData(data);
//    mChart.invalidate();
  }


  private BarData generateBarData() {

//    BarData d = new BarData();
//
//    ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
//
//    for (int index = 0; index < itemcount; index++)
//      entries.add(new BarEntry(getRandom(15, 30), index));
//
//    BarDataSet set = new BarDataSet(entries, "Bar DataSet");
//    set.setColor(Color.rgb(60, 220, 78));
//    set.setValueTextColor(Color.rgb(60, 220, 78));
//    set.setValueTextSize(5f);
//    d.addDataSet(set);
//
//    //set.setAxisDependency(YAxis.AxisDependency.RIGHT);
//
//    return d;

    BarData d = new BarData();


    // IMPORTANT: When using negative values in stacked bars, always make sure the negative values are in the array first
    ArrayList<BarEntry> yValues = new ArrayList<BarEntry>();


    for (int index = 0; index < itemcount; index++)
      yValues.add(new BarEntry(new float[]{getRandom(-30, 0), getRandom(15, 15),getRandom(5, 10) }, index));


    BarDataSet set = new BarDataSet(yValues, "");
    set.setValueTextSize(7f);
    set.setAxisDependency(YAxis.AxisDependency.RIGHT);
    set.setBarSpacePercent(40f);
    set.setColors(new int[]{Color.rgb(220, 60, 78), Color.rgb(60, 220, 78), Color.rgb(60, 60, 220)});
    set.setStackLabels(new String[]{
        "1", "2", "3"
    });
    d.addDataSet(set);
    return  d;
  }

  private LineData generateLineData() {

    LineData d = new LineData();

    ArrayList<Entry> entries = new ArrayList<Entry>();

    for (int index = 0; index < itemcount; index++)
      entries.add(new Entry(getRandom(5, 10), index));

    LineDataSet set = new LineDataSet(entries, "Line");
    set.setColor(Color.rgb(240, 238, 70));
    set.setLineWidth(2.5f);
    set.setCircleColor(Color.rgb(240, 238, 70));
    set.setCircleRadius(5f);
    set.setFillColor(Color.rgb(240, 238, 70));
    set.setDrawCubic(true);
    set.setDrawValues(true);
    set.setValueTextSize(10f);
    set.setValueTextColor(Color.rgb(240, 238, 70));

    set.setAxisDependency(YAxis.AxisDependency.LEFT);

    d.addDataSet(set);

    return d;
  }




  private BarData generateBarDataPlus() {

    BarData d = new BarData();

    ArrayList<BarEntry> entries = new ArrayList<BarEntry>();

    for (int index = 0; index < itemcount; index++)
      entries.add(new BarEntry(getRandom(15, 30), index));

    BarDataSet set = new BarDataSet(entries, "Bar DataSet");
    set.setColor(Color.rgb(60, 220, 78));
    set.setValueTextColor(Color.rgb(60, 220, 78));
    set.setValueTextSize(5f);
    d.addDataSet(set);

    //set.setAxisDependency(YAxis.AxisDependency.RIGHT);

    return d;
  }

  private BarDataSet generateBarSetPlus() {

    BarData d = new BarData();

    ArrayList<BarEntry> entries = new ArrayList<BarEntry>();

    for (int index = 0; index < itemcount; index++)
      entries.add(new BarEntry(getRandom(15, 30), index));

    BarDataSet set = new BarDataSet(entries, "Bar DataSet");
    set.setColor(Color.rgb(60, 220, 78));
    set.setValueTextColor(Color.rgb(60, 220, 78));
    set.setValueTextSize(5f);
    d.addDataSet(set);

    return set;
  }



  private BarData generateBarDataMinus() {
    BarData d = new BarData();
    ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
    for (int index = 0; index < itemcount; index++)
      entries.add(new BarEntry(getRandom(-30, 0), index));
    BarDataSet set = new BarDataSet(entries, "Bar DataSet");
    set.setColor(Color.rgb(220, 60, 78));
    set.setValueTextColor(Color.rgb(220, 60, 78));
    set.setValueTextSize(5f);
    d.addDataSet(set);
    //set.setAxisDependency(YAxis.AxisDependency.LEFT);

    return d;
  }

  private BarDataSet generateBarSetMinus() {
    BarData d = new BarData();
    ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
    for (int index = 0; index < itemcount; index++)
      entries.add(new BarEntry(getRandom(-30, 0), index));
    BarDataSet set = new BarDataSet(entries, "Bar DataSet");
    set.setColor(Color.rgb(220, 60, 78));
    set.setValueTextColor(Color.rgb(220, 60, 78));
    set.setValueTextSize(5f);
    return  set;
  }




  protected ScatterData generateScatterData() {

    ScatterData d = new ScatterData();

    ArrayList<Entry> entries = new ArrayList<Entry>();

    for (int index = 0; index < itemcount; index++)
      entries.add(new Entry(getRandom(20, 15), index));

    ScatterDataSet set = new ScatterDataSet(entries, "Scatter DataSet");
    set.setColor(Color.GREEN);
    set.setScatterShapeSize(7.5f);
    set.setDrawValues(false);
    set.setValueTextSize(10f);
    d.addDataSet(set);

    return d;
  }

  protected CandleData generateCandleData() {

    CandleData d = new CandleData();

    ArrayList<CandleEntry> entries = new ArrayList<CandleEntry>();

    for (int index = 0; index < itemcount; index++)
      entries.add(new CandleEntry(index, 20f, 10f, 13f, 17f));

    CandleDataSet set = new CandleDataSet(entries, "Candle DataSet");
    set.setColor(Color.rgb(80, 80, 80));
    set.setBarSpace(0.3f);
    set.setValueTextSize(10f);
    set.setDrawValues(false);
    d.addDataSet(set);

    return d;
  }

  protected BubbleData generateBubbleData() {

    BubbleData bd = new BubbleData();

    ArrayList<BubbleEntry> entries = new ArrayList<BubbleEntry>();

    for (int index = 0; index < itemcount; index++) {
      float rnd = getRandom(20, 30);
      entries.add(new BubbleEntry(index, rnd, rnd));
    }

    BubbleDataSet set = new BubbleDataSet(entries, "Bubble DataSet");
    set.setColors(ColorTemplate.VORDIPLOM_COLORS);
    set.setValueTextSize(10f);
    set.setValueTextColor(Color.WHITE);
    set.setHighlightCircleWidth(1.5f);
    set.setDrawValues(true);
    bd.addDataSet(set);

    return bd;
  }

  private float getRandom(float range, float startsfrom) {
    return (float) (Math.random() * range) + startsfrom;
  }

  private int[] getColors() {

    int stacksize = 3;

    // have as many colors as stack-values per entry
    int[] colors = new int[stacksize];

    for (int i = 0; i < stacksize; i++) {
      colors[i] = ColorTemplate.VORDIPLOM_COLORS[i];
    }

    return colors;
  }
}

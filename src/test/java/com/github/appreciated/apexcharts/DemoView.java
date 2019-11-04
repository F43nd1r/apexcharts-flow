package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.examples.ExampleChartGenerator;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;

import java.util.Arrays;

@Route("")
@Theme(value = Material.class, variant = Lumo.LIGHT)
public class DemoView extends Div {

    public DemoView() {
        Arrays.stream(ExampleChartGenerator.getCharts()).forEach(this::add);
        setSizeFull();
        getStyle()
                .set("display", "flex")
                .set("flex-direction", "column")
                .set("overflow", "auto");
        setSizeUndefined();
    }

}
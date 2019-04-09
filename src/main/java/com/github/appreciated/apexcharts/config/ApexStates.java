package com.github.appreciated.apexcharts.config;

public class ApexStates {
    Normal normal;
    class Normal {
        Filter filter;
        class Filter {
            String type;
            double value;
        }
    }
    Hover hover;
    class Hover {
        Filter filter;
        class Filter {
            String type;
            double value;
        }
    }
    Active active;
    class Active {
        Boolean allowMultipleDataPointsSelection;
        Filter filter;
        class Filter {
            String type;
            double value;
        }
    }
}
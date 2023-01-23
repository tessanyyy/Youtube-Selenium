package com.testdua.youtube.utils;

public enum TestScenarios {

    T1("TCC.YTB.001 Membuka web youtube"),
    T2("TCC.YTB.002 Search data valid");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}

package com.company.api.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.library.GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api")
public class LoggingTest {

    @ArchTest
    private final ArchRule NO_LOGS_WITH_JAVA_UTIL_LOGGING = NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

}

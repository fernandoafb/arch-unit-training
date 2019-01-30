package com.company.api.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api")
public class PackagesTest {

    @ArchTest
    public static final ArchRule controllerRule = classes()
            .that().areAnnotatedWith(RestController.class)
            .or().haveNameMatching(".*Controller")
            .should().resideInAPackage("..controller..");

}

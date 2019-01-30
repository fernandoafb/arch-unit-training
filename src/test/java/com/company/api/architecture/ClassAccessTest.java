package com.company.api.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api")
public class ClassAccessTest {

    @ArchTest
    public static final ArchRule serviceAccess = classes()
            .that().areAnnotatedWith(Service.class)
            .or().haveNameMatching(".*Service")
            .should().onlyBeAccessed().byClassesThat().areAnnotatedWith(Service.class)
            .orShould().onlyBeAccessed().byClassesThat().haveNameMatching(".*Service")
            .orShould().onlyBeAccessed().byClassesThat().areAnnotatedWith(RestController.class)
            .orShould().onlyBeAccessed().byClassesThat().haveNameMatching(".*Controller");

}

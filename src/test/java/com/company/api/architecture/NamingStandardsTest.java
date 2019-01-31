package com.company.api.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api")
public class NamingStandardsTest {

    @ArchTest
    public static final ArchRule servicesShouldBePrefixedRule = classes()
            .that().areAnnotatedWith(Service.class)
            .should().haveSimpleNameEndingWith("Service");

    @ArchTest
    public static final ArchRule interfacesShouldNotHaveSimpleClassNamesEndingWithTheWordInterfaceRule =
            noClasses().that().areInterfaces().should().haveSimpleNameContaining("Interface");

}

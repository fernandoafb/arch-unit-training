package com.company.api.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api", importOptions = { ImportOption.DontIncludeTests.class })
public class UserDomainTest {

    @ArchTest
    public static final ArchRule userDomainContainment = classes()
            .that().haveSimpleNameStartingWith("User")
            .should().resideInAPackage("com.company.api.user..");

}

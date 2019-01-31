package com.company.api.architecture;

import com.company.api.impl.LoggingInterface;
import com.company.api.impl.NewLoggingInterface;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.base.DescribedPredicate.lessThanOrEqualTo;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.company.api")
public class DeprecatingClassesTest {

    @ArchTest
    public static final ArchRule noNewClassesShouldImplementLoggingInterface =
            classes().that().implement(LoggingInterface.class)
                    .should().containNumberOfElements(lessThanOrEqualTo(1))
                    .because("from now on new classes should implement " + NewLoggingInterface.class.getName());

}

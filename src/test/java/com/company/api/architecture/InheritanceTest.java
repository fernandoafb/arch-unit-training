package com.company.api.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;
import org.springframework.data.repository.CrudRepository;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages =  { "com.company.api"  }, packagesOf = CrudRepository.class)
public class InheritanceTest {

    @ArchTest
    public static final ArchRule concreteRepositoriesShouldBeSuffixedWithRepository =
            classes().that().implement(CrudRepository.class)
            .should().haveSimpleNameEndingWith("Repository");

}

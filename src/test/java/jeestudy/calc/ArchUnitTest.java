package jeestudy.calc;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;

public class ArchUnitTest {

    @Test
    void test() {
        JavaClasses javaClasses = new ClassFileImporter().importPackages("jeestudy");

        ArchRule rule = noClasses().that().resideInAPackage("..domain..")
                .should().dependOnClassesThat().resideInAPackage("..calc..");

        rule.check(javaClasses);
    }
}

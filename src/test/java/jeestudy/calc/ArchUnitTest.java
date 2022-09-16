package jeestudy.calc;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;

public class ArchUnitTest {

    @Test
    void パッケージ依存の確認() {
        JavaClasses javaClasses = new ClassFileImporter().importPackages("jeestudy");

        ArchRule rule = noClasses().that().resideInAPackage("..domain..")
                .should().dependOnClassesThat().resideInAPackage("..calc..");

        rule.check(javaClasses);
    }
}

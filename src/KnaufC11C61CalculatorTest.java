import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class KnaufC11C61CalculatorTest {
    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"TECH_CODE_WALL_623_1", "GROUP_PN", "MATERIAL_TYPE_CODE_PN_FOR_C623"},
                {"TECH_CODE_WALL_623_2", "GROUP_PS", "MATERIAL_TYPE_CODE_PS_FOR_C623"},
                {"somestr", "GROUP_PN", "rowModelTos" + "GROUP_PN"},
                {"TECH_CODE_WALL_623_1", "foo", "rowModelTos" + "foo"},
        });
    }

    @Parameter(0)
    public String techModelToValue;

    @Parameter(1)
    public String pnGroup;

    @Parameter(2)
    public String expected;

    public void testHelper(KnaufC11C61Calculator_abstract calculator) {
        KnaufC11C61Calculator_abstract item = new KnaufC11C61Calculator_refactored();
        calculator.setTechModelToValue(techModelToValue);
        String result = calculator.getMaterialTypeCodeForKnaufCalculator(null, pnGroup);
        assertEquals(expected, result);
    }

    @Test
    public void testOriginal() {
        testHelper(new KnaufC11C61Calculator_original());
    }

    @Test
    public void testRefactored() {
        testHelper(new KnaufC11C61Calculator_refactored());
    }

    // Added some code to feature 1

}
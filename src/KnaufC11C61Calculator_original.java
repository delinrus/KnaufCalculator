import java.util.List;

public class KnaufC11C61Calculator_original extends KnaufC11C61Calculator_abstract {
    @Override
    public String getMaterialTypeCodeForKnaufCalculator(List<RowModelTo> rowModelTos, String pnGroup) {
        String techCodeWall = techModelTo.getTechCode();
        switch (pnGroup) {
            case (GROUP_PS):
                if (techCodeWall.equals(TECH_CODE_WALL_623_1) || techCodeWall.equals(TECH_CODE_WALL_623_2)) {
                    return MATERIAL_TYPE_CODE_PS_FOR_C623;
                }
            case (GROUP_PN):
                if (techCodeWall.equals(TECH_CODE_WALL_623_1) || techCodeWall.equals(TECH_CODE_WALL_623_2)) {
                    return MATERIAL_TYPE_CODE_PN_FOR_C623;
                }
            default:
                return getMaterialTypeCode(rowModelTos, pnGroup);
        }
    }

    // Added some code to master
}

import java.util.List;

public abstract class KnaufC11C61Calculator_abstract {
    public static final String GROUP_PS = "GROUP_PS";
    public static final String GROUP_PN = "GROUP_PN";
    public static final String MATERIAL_TYPE_CODE_PS_FOR_C623 = "MATERIAL_TYPE_CODE_PS_FOR_C623";
    public static final String MATERIAL_TYPE_CODE_PN_FOR_C623 = "MATERIAL_TYPE_CODE_PN_FOR_C623";

    public static final String TECH_CODE_WALL_623_1 = "TECH_CODE_WALL_623_1";
    public static final String TECH_CODE_WALL_623_2 = "TECH_CODE_WALL_623_2";

    protected TechModelTo techModelTo = new TechModelTo();

    private String techModelToValue;

    public void setTechModelToValue(String techModelToValue) {
        this.techModelToValue = techModelToValue;
    }

    class TechModelTo {
        String getTechCode() {
            return techModelToValue;
        }
    }

    static class RowModelTo {
    }

    protected String getMaterialTypeCode(List<RowModelTo> rowModelTos, String pnGroup) {
        return "rowModelTos" + pnGroup;
    }

    public abstract String getMaterialTypeCodeForKnaufCalculator(List<RowModelTo> rowModelTos, String pnGroup);
}

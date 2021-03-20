import java.util.List;
import java.util.Map;

public class KnaufC11C61Calculator_refactored extends KnaufC11C61Calculator_abstract {

    private static final Map<String, String> materialTypeCodeMap = Map.of(
            GROUP_PS, MATERIAL_TYPE_CODE_PS_FOR_C623,
            GROUP_PN, MATERIAL_TYPE_CODE_PN_FOR_C623);

    private static final List<String> techCodeList = List.of(TECH_CODE_WALL_623_1, TECH_CODE_WALL_623_2);

    @Override
    public String getMaterialTypeCodeForKnaufCalculator(List<RowModelTo> rowModelTos, String pnGroup) {
        if (techCodeList.contains(techModelTo.getTechCode())) {
            return materialTypeCodeMap.getOrDefault(pnGroup, getMaterialTypeCode(rowModelTos, pnGroup));
        }
        return getMaterialTypeCode(rowModelTos, pnGroup);
    }

//    public String getMaterialTypeCodeForKnaufCalculator(List<RowModelTo> rowModelTos, String pnGroup) {
//        String key = techCodeList.contains(techModelTo.getTechCode()) ? pnGroup : "";
//        return materialTypeCodeMap.getOrDefault(key, getMaterialTypeCode(rowModelTos, pnGroup));
//    }
}

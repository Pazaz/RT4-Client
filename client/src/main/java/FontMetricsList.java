import org.openrs2.deob.annotation.OriginalMember;

public class FontMetricsList {
    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!n;")
    public static final SoftLruHashTable fontMetrics = new SoftLruHashTable(4);
}

package IdentifyClueScrolls

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.MiniMenuEntry
import plugin.api.MiniMenuType
import rt4.ObjTypeList

@PluginMeta(
    author = "bushtail",
    description = "Identify clue scrolls easily",
    version = 1.0
)

class plugin : Plugin() {
    override fun DrawMiniMenu(entry: MiniMenuEntry?) {
        when(entry?.type) {
            MiniMenuType.OBJ -> {
                val index = entry.subjectIndex
                val def = ObjTypeList.get(index.toInt())
                if(entry.verb.equals("read", true)) {
                    if(EASY.contains(index.toInt())) {
                        entry.subject = entry.subject + " (easy)"
                    } else if(MEDIUM.contains(index.toInt())) {
                        entry.subject = entry.subject + " (medium)"
                    } else if(HARD.contains(index.toInt())) {
                        entry.subject = entry.subject + " (hard)"
                    }
                }
            }
        }
    }

    private val EASY = intArrayOf(
        2682,
        2679,
        2680,
        2684,
        2685,
        2689,
        2690,
        2691,
        2695,
        2696,
        2697,
        2698,
        2702,
        2703,
        2707,
        2708,
        2711,
        2716,
        2719,
        2722,
        2725,
        2729,
        2731,
        2733,
        2735,
        2737,
        2745,
        2805,
        2785,
        2786,
        2788,
        2790,
        2792
    )

    private val MEDIUM = intArrayOf(
        2677,
        2678,
        2686,
        2687,
        2688,
        2692,
        2693,
        2694,
        2699,
        2700,
        2704,
        2705,
        2712,
        2723,
        2739,
        2743,
        2747,
        2776,
        2778,
        2780,
        2793,
        2794,
        2796,
        2801,
        2803,
        2807,
        2809,
        2811,
        2813,
        2815,
        2817,
        2819,
        2821,
        2823,
        2825,
        2827,
        2829,
        2833,
        2839,
        2841,
        2849,
        2851,
        2853,
        2855,
        2857,
        2858,
        3490,
        3491,
        3492,
        3493,
        3494,
        3495,
        3496,
        3497,
        3499,
        3500
    )

    private val HARD = intArrayOf(
        2681,
        2701,
        2706,
        2710,
        2713,
        2741,
        2773,
        2774,
        2782,
        2783,
        2797,
        2799,
        2831,
        2835,
        2843,
        2845,
        2856,
        3498,
        3501,
        3502,
        3503,
        3504,
        3505,
        3506,
        3507,
        3508,
        3509,
        3510,
        3512,
        3513,
        3514,
        3515,
        3516,
        3518,
        3520,
        3522,
        3524,
        3525
    )
}
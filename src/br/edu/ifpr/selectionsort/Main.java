package br.edu.ifpr.selectionsort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int array[] = {257, 978, 622, 409, 708, 251, 608, 356, 855, 194, 783, 699, 25, 622, 490, 440, 443, 518, 596, 661, 449, 546, 128, 908, 889, 936, 49, 976, 161, 284, 40, 972, 829, 951, 823, 646, 894, 394, 290, 192, 158, 815, 181, 123, 847, 948, 480, 391, 35, 293, 200, 420, 678, 46, 719, 190, 32, 762, 667, 569, 119, 506, 788, 457, 226, 893, 167, 299, 664, 800, 904, 470, 294, 955, 276, 432, 191, 656, 700, 655, 861, 392, 181, 452, 542, 876, 941, 573, 547, 733, 280, 744, 802, 352, 528, 303, 387, 330, 963, 693, 599, 699, 270, 931, 180, 722, 416, 471, 917, 262, 33, 441, 374, 747, 457, 571, 918, 641, 29, 109, 349, 597, 620, 379, 645, 162, 79, 203, 821, 128, 775, 694, 247, 495, 73, 155, 635, 720, 212, 850, 509, 352, 811, 948, 770, 98, 198, 636, 880, 264, 755, 818, 803, 862, 762, 180, 171, 475, 902, 17, 83, 324, 255, 988, 805, 735, 756, 449, 80, 153, 757, 511, 691, 844, 375, 402, 572, 121, 129, 116, 665, 86, 156, 951, 256, 564, 959, 705, 538, 999, 88, 237, 218, 947, 542, 610, 35, 95, 947, 290, 255, 225, 399, 9, 484, 830, 896, 760, 680, 596, 118, 637, 230, 534, 218, 1, 89, 523, 319, 533, 853, 715, 65, 546, 53, 455, 617, 332, 702, 484, 922, 954, 291, 716, 742, 212, 706, 753, 474, 113, 75, 678, 225, 245, 249, 884, 579, 587, 985, 630, 598, 372, 912, 10, 301, 4, 345, 773, 388, 478, 411, 385, 526, 460, 512, 613, 726, 317, 810, 473, 609, 746, 505, 509, 341, 830, 664, 117, 715, 386, 181, 403, 431, 603, 230, 65, 592, 961, 241, 401, 451, 772, 604, 507, 258, 653, 124, 514, 298, 566, 809, 379, 298, 551, 829, 867, 231, 142, 125, 989, 789, 994, 936, 916, 255, 340, 845, 139, 831, 659, 130, 7, 810, 507, 975, 557, 226, 944, 976, 781, 391, 461, 641, 426, 392, 851, 180, 221, 683, 912, 638, 550, 812, 831, 927, 359, 146, 69, 128, 828, 949, 687, 511, 802, 620, 77, 270, 899, 619, 843, 986, 124, 25, 92, 527, 3, 287, 475, 353, 176, 301, 392, 285, 110, 591, 276, 918, 726, 348, 721, 651, 577, 327, 288, 309, 752, 374, 560, 679, 282, 40, 792, 926, 281, 828, 249, 408, 129, 932, 643, 145, 958, 944, 939, 264, 65, 735, 493, 296, 726, 777, 268, 954, 381, 40, 475, 800, 212, 572, 63, 444, 869, 957, 203, 455, 481, 275, 719, 238, 777, 162, 399, 679, 604, 330, 891, 113, 170, 226, 248, 297, 715, 916, 242, 361, 285, 444, 988, 387, 753, 890, 526, 819, 977, 15, 41, 642, 600, 347, 475, 799, 525, 541, 210, 88, 590, 517, 38, 326, 909, 579, 999, 686, 65, 930, 695, 460, 956, 895, 590, 938, 716, 963, 185, 951, 353, 32, 358, 314, 146, 257, 167, 413, 156, 753, 816, 959, 104, 317, 543, 674, 79, 262, 695, 827, 100, 279, 272, 407, 167, 637, 918, 970, 650, 836, 892, 643, 753, 534, 918, 252, 243, 294, 928, 350, 591, 387, 727, 361, 709, 776, 161, 264, 875, 16, 379, 859, 760, 87, 367, 822, 112, 811, 664, 447, 773, 81, 396, 813, 118, 76, 292, 860, 903, 993, 355, 612, 60, 510, 945, 873, 171, 273, 347, 502, 253, 532, 72, 267, 945, 13, 162, 341, 118, 700, 551, 20, 34, 358, 180, 168, 747, 919, 229, 84, 425, 516, 35, 765, 551, 806, 770, 492, 148, 219, 566, 479, 34, 630, 650, 606, 827, 103, 332, 168, 290, 805, 760, 534, 245, 111, 912, 527, 965, 330, 493, 59, 199, 604, 260, 908, 427, 744, 832, 710, 814, 451, 455, 495, 38, 443, 940, 272, 601, 911, 97, 284, 914, 672, 847, 488, 938, 463, 44, 16, 951, 289, 735, 339, 35, 397, 338, 628, 636, 303, 708, 482, 931, 676, 611, 729, 499, 797, 931, 263, 393, 257, 669, 187, 626, 979, 647, 599, 525, 379, 188, 598, 245, 120, 136, 272, 35, 683, 737, 107, 839, 847, 917, 356, 320, 324, 549, 43, 984, 202, 195, 604, 117, 131, 669, 874, 901, 426, 29, 558, 361, 543, 532, 597, 68, 284, 723, 615, 857, 98, 718, 140, 831, 684, 597, 81, 322, 333, 840, 560, 574, 198, 311, 262, 682, 695, 475, 125, 863, 399, 389, 466, 284, 39, 920, 337, 240, 688, 757, 108, 410, 157, 668, 835, 368, 883, 265, 205, 995, 108, 715, 748, 99, 843, 268, 599, 852, 507, 845, 840, 997, 584, 938, 702, 528, 806, 605, 878, 875, 456, 202, 818, 651, 409, 54, 355, 103, 943, 45, 971, 488, 709, 423, 691, 395, 519, 270, 3, 911, 184, 278, 224, 698, 688, 441, 415, 827, 898, 790, 280, 907, 681, 909, 150, 446, 842, 250, 746, 919, 980, 652, 207, 861, 500, 297, 617, 304, 325, 944, 383, 767, 997, 722, 479, 210, 227, 629, 744, 703, 861, 87, 795, 84, 814, 596, 451, 903, 875, 859, 155, 677, 510, 579, 862, 245, 500, 406, 506, 313, 146, 183, 342, 264, 789, 957, 947, 218, 22, 828, 534, 722, 572, 988, 107, 33, 155, 360, 341, 708, 18, 270, 82, 948, 578, 30, 364, 166, 27, 600, 714, 855, 793, 326, 229, 102, 875, 611, 46, 766, 452, 256, 557, 158, 730, 193, 36, 46, 332, 872, 698, 384, 177, 469, 899, 329, 371, 632, 148, 435, 443, 517, 917, 192, 686, 923, 696, 501, 748, 633, 829, 72, 961, 597, 632, 160, 789, 843, 586, 152, 302, 630, 299, 455, 269, 918, 2, 279, 406, 678, 955, 207, 960, 912, 127, 976, 445, 832, 354, 952, 468, 322, 765, 198, 842, 728, 723, 276, 559, 12, 329, 90, 380, 655, 543, 772, 666, 555, 275, 946, 381, 195, 588, 80, 680, 413, 732, 489, 186, 721, 183, 405, 87, 57, 296, 436, 561, 877, 355, 286, 69, 114, 613, 224, 218, 550, 55, 725, 883, 586, 18, 407, 662, 548, 148, 472, 197, 89, 848, 402, 266, 35, 332, 366, 704, 180, 636, 957, 204, 592, 228, 289, 98, 264, 810, 231, 108, 528, 378, 332, 926, 86, 835, 649, 668, 573, 23, 812, 44, 246, 47, 964, 80, 762, 669, 33, 556, 31, 627, 893, 327, 324, 337, 563, 908, 146, 740, 35, 103, 737, 658, 222, 109, 812, 450, 732, 708, 594, 759, 824, 993, 994, 510, 541, 777, 434, 133, 96, 31, 324, 27, 617, 812, 398, 999, 503, 349, 844, 784, 206, 294, 28, 947, 368, 892, 422, 907, 469, 17, 214, 291, 40, 952, 735, 87, 529, 392, 814, 785, 872, 69, 560, 543, 396, 905, 73, 785, 688, 522, 930, 632, 391, 614, 678, 330, 532, 137, 537, 34, 40, 775, 286, 685, 528, 317, 315, 791, 898, 937, 171, 652, 573, 194, 600, 306, 715, 425, 754, 955, 260, 111, 817, 505, 951, 201, 715, 130, 831, 183, 690, 11, 240, 794, 229, 713, 548, 915, 209, 11, 247, 336, 940, 330, 971, 577, 567, 162, 913, 217, 533, 451, 133, 912, 547, 120, 644, 181, 326, 8, 413, 185, 348, 259, 257, 831, 712, 836, 16, 111, 774, 333, 353, 369, 622, 273, 430, 327, 88, 202, 786, 596, 285, 82, 992, 152, 782, 527, 753, 61, 44, 8, 489, 388, 355, 596, 263, 216, 515, 298, 248, 853, 612, 746, 598, 113, 69, 938, 274, 272, 457, 654, 507, 566, 160, 47, 473, 836, 53, 539, 771, 542, 305, 565, 897, 596, 795, 499, 759, 116, 978, 398, 919, 120, 873, 615, 706, 443, 301, 932, 58, 855, 774, 17, 615, 571, 95, 60, 716, 640, 100, 897, 965, 650, 616, 524, 360, 228, 288, 684, 973, 748, 688, 580, 195, 782, 311, 862, 712, 36, 769, 945, 164, 938, 657, 313, 571, 943, 313, 741, 869, 592, 224, 851, 364, 231, 734, 224, 817, 97, 455, 12, 308, 886, 529, 585, 126, 681, 228, 45, 540, 670, 206, 93, 546, 707, 944, 113, 914, 127, 608, 455, 848, 784, 971, 143, 571, 1, 871, 429, 866, 728, 290, 29, 312, 485, 379, 65, 573, 358, 875, 574, 395, 439, 47, 117, 738, 31, 61, 149, 320, 430, 25, 101, 809, 571, 195, 263, 238, 586, 614, 904, 21, 434, 543, 709, 821, 717, 920, 431, 989, 72, 32, 71, 592, 258, 313, 396, 766, 794, 630, 297, 634, 185, 151, 828, 523, 678, 482, 889, 130, 448, 400, 957, 631, 782, 41, 582, 88, 787, 53, 648, 832, 333, 816, 794, 839, 988, 952, 111, 579, 856, 38, 433, 907, 211, 215, 712, 468, 213, 918, 415, 898, 710, 768, 223, 669, 799, 332, 85, 493, 425, 69, 367, 91, 375, 781, 333, 29, 392, 399, 754, 134, 52, 593, 481, 472, 984, 973, 748, 702, 292, 682, 255, 579, 465, 636, 755, 465, 920, 852, 583, 423, 838, 717, 9, 138, 979, 837, 314, 942, 762, 843, 80, 281, 819, 60, 109, 148, 92, 340, 588, 631, 334, 275, 236, 320, 115, 405, 12, 384, 286, 646, 894, 90, 899, 145, 129, 40, 757, 395, 951, 756, 550, 352, 173, 632, 97, 177, 193, 763, 411, 761, 181, 201, 320, 339, 465, 829, 290, 634, 975, 86, 989, 796, 96, 923, 342, 324, 732, 451, 665, 754, 383, 477, 737, 522, 191, 913, 82, 878, 113, 994, 218, 136, 675, 169, 606, 111, 596, 591, 402, 941, 272, 22, 448, 452, 120, 893, 194, 355, 926, 766, 450, 769, 613, 165, 670, 524, 31, 583, 681, 821, 113, 756, 4, 20, 873, 971, 52, 540, 960, 561, 237, 827, 442, 878, 93, 873, 329, 660, 19, 602, 817, 748, 453, 865, 303, 135, 993, 322, 467, 78, 283, 628, 365, 142, 950, 738, 788, 843, 414, 421, 344, 872, 665, 680, 793, 945, 278, 535, 417, 413, 189, 4, 108, 427, 862, 591, 280, 207, 990, 754, 719, 545, 580, 854, 817, 387, 506, 118, 911, 717, 103, 630, 938, 239, 145, 39, 154, 442, 160, 314, 643, 171, 125, 982, 569, 213, 561, 40, 892, 274, 74, 718, 782, 382, 184, 832, 617, 440, 342, 899, 527, 253, 804, 667, 433, 803, 522, 757, 880, 663, 990, 614, 858, 675, 806, 755, 868, 887, 786, 495, 799, 379, 632, 418, 445, 23, 227, 956, 322, 320, 342, 598, 391, 591, 401, 224, 889, 726, 862, 61, 336, 522, 238, 688, 988, 256, 717, 905, 690, 750, 76, 679, 308, 543, 373, 292, 519, 777, 992, 80, 510, 559, 724, 691, 804, 110, 522, 730, 182, 343, 931, 108, 334, 936, 370, 786, 68, 239, 540, 810, 87, 452, 924, 455, 25, 969, 27, 518, 1, 728, 420, 998, 410, 602, 54, 589, 697, 392, 98, 492, 956, 591, 173, 198, 821, 437, 407, 266, 206, 858, 697, 922, 590, 238, 238, 168, 225, 645, 608, 516, 446, 513, 995, 100, 2, 228, 887, 841, 875, 479, 783, 57, 527, 764, 46, 183, 106, 541, 545, 819, 861, 120, 151, 455, 148, 512, 334, 879, 432, 512, 263, 843, 739, 870, 81, 221, 59, 529, 843, 698, 45, 625, 27, 175, 403, 434, 452, 370, 160, 780, 492, 657, 175, 986, 19, 474, 60, 573, 743, 113, 890, 189, 741, 199, 852, 587, 714, 29, 199, 430, 783, 205, 340, 56, 483, 729, 404, 500, 506, 731, 163, 950, 43, 120, 375, 639, 80, 658, 962, 811, 366, 368, 291, 865, 396, 652, 868, 590, 841, 897, 180, 830, 886, 598, 292, 985, 546, 756, 46, 14, 828, 16, 241, 727, 795, 997, 993, 64, 738, 281, 700, 749, 383, 274, 175, 687, 274, 677, 239, 290, 595, 243, 956, 518, 300, 689, 760, 640, 798, 250, 285, 717, 815, 347, 563, 922, 800, 210, 289, 995, 309, 444, 723, 214, 46, 682, 402, 483, 267, 951, 602, 675, 28, 793, 277, 297, 102, 41, 540, 593, 361, 353, 949, 460, 254, 785, 872, 501, 286, 461, 3, 139, 742, 127};
        selectionSort(array);
        printArray(array);

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = i;
            for (int j = i+1; j < array.length; j++) {
                Sum.totalComparation++;
                if (array[j]<array[key])
                    key = j;
            }
            if (key != i) {
                Sum.totalSwap++;
                int temp = array[i];
                array[i] = array[key];
                array[key] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Selection Organizado"))) {
            writer.write("{");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                if(i<array.length - 1){
                    writer.write(", ");
                }
            }
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nTotal de comparações: "+ Sum.totalComparation+"\nTotal de trocas: "+ Sum.totalSwap);
    }
}

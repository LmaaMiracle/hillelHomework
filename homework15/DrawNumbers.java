package yarchuk;

import java.util.List;

public class DrawNumbers {

    public StringBuilder drawMyNumbers(String numbers) {

        if (!isDigit(numbers)) {
            throw new IllegalArgumentException("Only digits are allowed in the string");
        }

        StringBuilder pseudographics = new StringBuilder();

        for (char digit : numbers.toCharArray()) {
            switch (digit) {
                case '0': {
                    pseudographics.append("\n  ###   \n" +
                            " #   #  \n" +
                            "#     # \n" +
                            "#     # \n" +
                            "#     # \n" +
                            " #   #  \n" +
                            "  ###   \n");
                    break;
                }
                case '1': {
                    pseudographics.append("\n  #   \n" +
                            " ##   \n" +
                            "# #   \n" +
                            "  #   \n" +
                            "  #   \n" +
                            "  #   \n" +
                            "##### \n");
                    break;
                }
                case '2': {
                    pseudographics.append("\n #####  \n" +
                            "#     # \n" +
                            "      # \n" +
                            " #####  \n" +
                            "#       \n" +
                            "#       \n" +
                            "####### \n");
                    break;
                }
                case '3': {
                    pseudographics.append("\n #####  \n" +
                            "#     # \n" +
                            "      # \n" +
                            " #####  \n" +
                            "      # \n" +
                            "#     # \n" +
                            " #####  \n");
                    break;
                }
                case '4': {
                    pseudographics.append("\n#       \n" +
                            "#    #  \n" +
                            "#    #  \n" +
                            "#    #  \n" +
                            "####### \n" +
                            "     #  \n" +
                            "     #  \n");
                    break;
                }
                case '5': {
                    pseudographics.append("\n####### \n" +
                            "#       \n" +
                            "#       \n" +
                            "######  \n" +
                            "      # \n" +
                            "#     # \n" +
                            " #####  \n");
                    break;
                }
                case '6': {
                    pseudographics.append("\n #####  \n" +
                            "#     # \n" +
                            "#       \n" +
                            "######  \n" +
                            "#     # \n" +
                            "#     # \n" +
                            " #####  \n");
                    break;
                }

                case '7': {
                    pseudographics.append("\n####### \n" +
                            "#    #  \n" +
                            "    #   \n" +
                            "   #    \n" +
                            "  #     \n" +
                            "  #     \n" +
                            "  #     \n");
                    break;
                }

                case '8': {
                    pseudographics.append("\n #####  \n" +
                            "#     # \n" +
                            "#     # \n" +
                            " #####  \n" +
                            "#     # \n" +
                            "#     # \n" +
                            " #####  \n");
                    break;
                }

                case '9': {
                    pseudographics.append("\n #####  \n" +
                            "#     # \n" +
                            "#     # \n" +
                            " ###### \n" +
                            "      # \n" +
                            "#     # \n" +
                            " #####  \n");
                    break;
                }
            }
        }
        return pseudographics;
    }


    private boolean isDigit(String string) {
        for (char elem : string.toCharArray()) {
            if (!Character.isDigit(elem)) {
                return false;
            }
        }
        return true;
    }

}

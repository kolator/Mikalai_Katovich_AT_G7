package homework.week3;

//public class StringTask_1_4 {
//    public static void analyzeLog(String log) {
//        StringBuilder ip = new StringBuilder(); // Переменная для хранения IP-адреса
//        StringBuilder status = new StringBuilder(); // Переменная для хранения статуса доступа (granted или denied)
//        boolean isIp = false; // Флаг для определения, что сейчас парсим IP-адрес
//        boolean isStatus = false; // Флаг для определения, что сейчас парсим статус доступа
//        int okCount = 0; // Счетчик удачных попыток доступа
//        int failedCount = 0; // Счетчик неудачных попыток доступа
//
//        for (int i = 0; i < log.length(); i++) {
//            char c = log.charAt(i); // Получаем текущий символ
//
//            if (Character.isDigit(c) || c == '.') { // Если символ является цифрой или точкой
//                if (isStatus) { // Если мы уже получили статус доступа, значит это IP-адрес
//                    ip.append(c); // Добавляем символ к IP-адресу
//                } else { // Иначе это статус доступа
//                    status.append(c); // Добавляем символ к статусу доступа
//                }
//            } else if (c == ' ') { // Если символ является пробелом
//                if (!isIp) { // Если мы еще не получили IP-адрес
//                    isIp = true; // Устанавливаем флаг
//                } else { // Если мы уже получили IP-адрес, значит это статус доступа
//                    isStatus = true; // Устанавливаем флаг
//                }
//            } else if (c == '\n') { // Если символ является символом новой строки
//                if (status.toString().equals("granted")) { // Если статус доступа - granted
//                    okCount++; // Увеличиваем счетчик удачных попыток
//                } else { // Иначе статус доступа - denied
//                    failedCount++; // Увеличиваем счетчик неудачных попыток
//                }
//
//                System.out.println("ip " + ip.toString() + ": ok - " + okCount + ", failed - " + failedCount);
//
//                // Сбрасываем значения переменных для следующей строки лога
//                ip.setLength(0);
//                status.setLength(0);
//                isIp = false;
//                isStatus = false;
//                okCount = 0;
//                failedCount = 0;
//            }
//        }
//    }
//}

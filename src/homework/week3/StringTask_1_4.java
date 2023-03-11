package homework.week3;

public class StringTask_1_4 {
    public static void main(String[] args) {
        String ipAddresses = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied";

        int[] okCounts = new int[10];  // Максимальное количество IP-адресов
        int[] failedCounts = new int[10];
        String[] addresses = new String[10];

        int count = 0;
        for (String line : ipAddresses.split("\n")) {
            if (line == null) {
                continue;
            }

            String[] parts = line.split("\\s+", 3);
            String address = parts[1];
            String status = parts[2];

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (addresses[i].equals(address)) {
                    found = true;
                    if (status.equals("granted")) {
                        okCounts[i]++;
                    } else if (status.equals("denied")) {
                        failedCounts[i]++;
                    }
                    break;
                }
            }
            if (!found) {
                addresses[count] = address;
                if (status.equals("granted")) {
                    okCounts[count] = 1;
                } else if (status.equals("denied")) {
                    failedCounts[count] = 1;
                }
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            String ip = addresses[i];
            int okCount = okCounts[i];
            int failedCount = failedCounts[i];
            System.out.println("ip " + ip + ": ok - " + okCount + ", failed - " + failedCount);
        }
    }
}
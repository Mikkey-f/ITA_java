import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        // 修正源文件路径：使用双反斜杠，移除多余的冒号
        String scrPath = "D:\\新建文件夹 (2)\\其他图片\\恋与深空\\3";
        File file = new File(scrPath);

        // 修正目标文件扩展名（假设为.png）
        String desPath = "d:\\copyed.png";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 检查源文件是否存在
            if (!file.exists()) {
                System.out.println("源文件不存在: " + scrPath);
                return;
            }

            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(desPath));

            byte[] buff = new byte[1024];
            int len;
            while ((len = bis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }

            System.out.println("文件复制成功!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

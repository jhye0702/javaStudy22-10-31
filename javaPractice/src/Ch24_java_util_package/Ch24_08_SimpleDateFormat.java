package Ch24_java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Date�� SimpleDateFormat Ŭ������ �̿��ؼ�
 * ������ ��¥�� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��غ�����
 * 
 * ������ :
 * 2022�� 08�� 22�� ������ 18�� 09��
 */
public class Ch24_08_SimpleDateFormat {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(new Date()));
	}
}

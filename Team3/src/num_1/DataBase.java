package num_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;

public class DataBase {
	Map<String, ArrayList<UserSelectNum>> map = new HashMap();
	Map<String, JLabel[]> mapLbls = new HashMap();
	Map<String, JButton> mapAuto = new HashMap();
	Map<String, JButton> mapCopy = new HashMap();

	public DataBase() {
		map.put("A", new ArrayList<UserSelectNum>());
		map.put("B", new ArrayList<UserSelectNum>());
		map.put("C", new ArrayList<UserSelectNum>());
		map.put("D", new ArrayList<UserSelectNum>());
		map.put("E", new ArrayList<UserSelectNum>());
		
		mapLbls.put("A", new JLabel[45]);
		mapLbls.put("B", new JLabel[45]);
		mapLbls.put("C", new JLabel[45]);
		mapLbls.put("D", new JLabel[45]);
		mapLbls.put("E", new JLabel[45]);

		mapAuto.put("A", new JButton());
		mapAuto.put("B", new JButton());
		mapAuto.put("C", new JButton());
		mapAuto.put("D", new JButton());
		mapAuto.put("E", new JButton());

		mapCopy.put("A", new JButton());
		mapCopy.put("B", new JButton());
		mapCopy.put("C", new JButton());
		mapCopy.put("D", new JButton());
		mapCopy.put("E", new JButton());

//		add();

//		resultTest();
	}

	public Map<String, ArrayList<UserSelectNum>> getMap() {
		return map;
	}
}
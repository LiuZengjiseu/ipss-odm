package org.ieee.odm.adapter.bpa;

import java.util.StringTokenizer;

import org.ieee.odm.adapter.AbstractODMAdapter;
import org.ieee.odm.adapter.bpa.lf.BPABusRecord;
import org.ieee.odm.common.IFileReader;
import org.ieee.odm.common.ODMException;
import org.ieee.odm.model.IODMModelParser;
import org.ieee.odm.model.base.ODMModelStringUtil;

import com.interpss.core.aclf.AclfBus;
import com.interpss.core.aclf.AclfGen;
import com.interpss.core.aclf.AclfGenCode;
import com.interpss.core.aclf.AclfNetwork;

public class BPAResultAdapter extends AbstractODMAdapter{
	private AclfNetwork aclfNet;
	private long n;
	public BPAResultAdapter(AclfNetwork aclfNet){
		this.aclfNet=aclfNet;
	}
	
	@Override
	protected IODMModelParser parseInputFile(IFileReader din, String encoding) throws ODMException {
		String str;
		do {
			str = din.readLine(); 
			if (str!=null)
				mapInputLine(str);
		} while (str!=null);	
		return null;
	}

	private void mapInputLine(String str) {
		// TODO Auto-generated method stub
		String[] strAry=getBusVoltageData(str);
		if (strAry[0] != null) {
			try {
				n++;
				String id=BPABusRecord.getBusId(strAry[0]);
				AclfBus bus = aclfNet.getBus(id);
				
				bus.setVoltageMag(Double.valueOf(strAry[1])/bus.getBaseVoltage()*1000);
				bus.setVoltageAng(Double.valueOf(strAry[2])/180 * 3.1415926);
				if(bus.getGenCode()==AclfGenCode.GEN_PV){
					bus.setDesiredVoltMag(Double.valueOf(strAry[1])/bus.getBaseVoltage()*1000);
				}
				
			} catch (ODMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	protected IODMModelParser parseInputFile(NetType type, IFileReader[] dins, String encoding) throws ODMException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String[] getBusVoltageData(String str){
		String[] strAry = new String[3];
		String name;
		String voltage;
		//TODO get bus voltage mag and ang
		String str1=ODMModelStringUtil.getStringReturnEmptyString(str,1, 1); 
		if(str1.length()<1){
			return strAry;
		}
		else{
			name=ODMModelStringUtil.getStringReturnEmptyString(str,1, 5); 
			int chineseCharNum=ODMModelStringUtil.getChineseCharNum(name)+1;
			voltage	=ODMModelStringUtil.getStringReturnEmptyString(str,10-chineseCharNum, 16-chineseCharNum); 	
			strAry[0]=name+voltage;
			
			strAry[1]=ODMModelStringUtil.getStringReturnEmptyString(str,17-chineseCharNum, 23-chineseCharNum);
			strAry[2]=ODMModelStringUtil.getStringReturnEmptyString(str,27-chineseCharNum, 31-chineseCharNum);
			
		}
		
		return strAry;
	}
}

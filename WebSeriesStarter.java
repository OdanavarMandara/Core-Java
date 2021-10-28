package com.xworkz.dp;
import com.xworkz.dp.Dao.*;
import com.xworkz.dp.Constants.*;
import com.xworkz.dp.Dto.*;

public class WebSeriesStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebSeriesDTO webSeriesDTO=new  WebSeriesDTO("aaa",Genre.ACTION,400,5.5f,8,9);
		WebSeriesDTO webSeriesDTO1=new  WebSeriesDTO("bbb",Genre.HORROR,200,6.8f,1,1);
		WebSeriesDTO webSeriesDTO2=new WebSeriesDTO("ccc",Genre.ADVENTURE,400,8.1f,1,1);
		
		
		WebSeriesDAO web=new WebSeriesDAO();
		web.save(webSeriesDTO);
		web.save(webSeriesDTO2);
		
		
		web.display();
		
		web.delete(-1);
		web.delete(0);
		
		web.display();
		
		
		web.update(webSeriesDTO2,6);
		
		web.display();
		
		
	}

}

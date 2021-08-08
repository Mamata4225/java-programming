package com.xworkz.beach;


	import java.util.Comparator;

import com.xworkz.beach.dto.BeachDTO;

	public class BeachNoOfCamparator implements Comparator<BeachDTO>{

		@Override
		public int compare(BeachDTO o1, BeachDTO o2) {
			Integer o1No=o1.getNoOfResorts();
			Integer o2No=o2.getNoOfResorts();
			return o2No.compareTo(o1No);
		}

	}
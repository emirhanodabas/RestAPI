package com.medipol.yazilimarac.RestAPIOrnek1;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestAPI {
	private static List<Ogrenci> OGRENCILER=new ArrayList<>();
	@GetMapping("/listele")
	public List<Ogrenci>listele(){
		return OGRENCILER;
	}
	@PostMapping("/ekle")
	public String ekle(@RequestBody Ogrenci ogrenci) {
		OGRENCILER.add(ogrenci);
		return ogrenci.numara;
	}
	
	public static class Ogrenci{
		private String isim;
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public String getNumara() {
			return numara;
		}
		public void setNumara(String numara) {
			this.numara = numara;
		}
		private String numara;
	}

}

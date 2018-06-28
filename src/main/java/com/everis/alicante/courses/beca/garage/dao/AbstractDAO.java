package com.everis.alicante.courses.beca.garage.dao;

import com.everis.alicante.courses.beca.garage.domain.GarageEntity;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<T extends GarageEntity> {

	private File file;
	

	public List<T> findAll() {
		List<T> result = new ArrayList<>();
		openFile();
		List<String> lines;
		try {
			lines = FileUtils.readLines(file, "UTF-8");
			for (String string : lines) {
				if(!string.isEmpty()) {
					result.add(this.build(string.split(";")));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public void save(final T element) {
			try {
				openFile();
				Writer w;
				w = new FileWriter(file,true);
				BufferedWriter bfW= new BufferedWriter(w);
				bfW.newLine();
				bfW.append(this.toFile(element));
				bfW.close();
				w.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public void delete(final T element) {
		List<T> result = new ArrayList<>();
		result=findAll();
		for(T o:result) {
			if(o.toString().equals(element.toString())) {
				result.remove(o);
				break;
			}
		}
		file.delete();
		openFile();
		for(T o:result) {
			save(o);
		}
	}

	public T get(final int i) {
		List<T> result = new ArrayList<>();
		result=findAll();
		return result.get(i);
	}

	public abstract String getFilePath();

	private void openFile() {
		file = new File(getFilePath());
	}

	public abstract T build(String... strings);

	public abstract String toFile(T element);

}

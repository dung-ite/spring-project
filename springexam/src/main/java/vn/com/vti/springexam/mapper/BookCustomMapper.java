package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.BookCustom;

public interface BookCustomMapper {
	public List<BookCustom> selectByNamePart(String bookName);
	public List<BookCustom> selectAll();
}

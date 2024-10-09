package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.PrefectureCustom;

public interface PrefectureCustomMapper {
	public List<PrefectureCustom> selectByNamePart(String prefectureName);
}

package bros.c.common.facade.service;

import java.util.Map;

import bros.common.core.entity.ResponseEntity;
import bros.common.core.exception.ServiceException;
/**
 * 
 * @ClassName: ICCityCacheServiceFacade 
 * @Description: 城市信息操作接口
 * @author 何鹏
 * @date 2016年7月11日 下午2:03:12 
 * @version 1.0
 */
public interface ICCityCacheServiceFacade {
	/**
	 * 
	 * @Title: queryAllPubCityInfo 
	 * @Description: 查询所有城市信息（不需要上送变量，需要上送报文头）
	 * @param headMap
	 * @param bodyMap
	 * @return
	 * @throws ServiceException
	 */
	public ResponseEntity queryAllPubCityInfo(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;
	/**
	 * 
	 * @Title: queryPubCityInfoByName 
	 * @Description: 根据名称模糊查询城市信息
	 * @param headMap 报文头
	 * @param bodyMap （name名称字段）
	 * @return
	 * @throws ServiceException
	 */
	public ResponseEntity queryPubCityInfoByName(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;
	/**
	 * 
	 * @Title: queryPubCityInfoByCode 
	 * @Description: 根据省份code查询城市信息服务
	 * @param headMap 报文头
	 * @param bodyMap （code名称字段）
	 * @return
	 * @throws ServiceException
	 */
	public ResponseEntity queryPubCityInfoByCode(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;

}

package bros.p.bankmanage.facade.service;

import java.util.Map;

import bros.common.core.entity.ResponseEntity;
import bros.common.core.exception.ServiceException;

/** 
 * @ClassName:IPBannerinfoServiceFacade  
 * @Description:广告栏服务提供方对外暴露服务接口
 * @author  wuchenglong
 * @date 2016年9月6日 上午14:50:28 
 * @version V1.0  
 */
public interface IPBannerinfoServiceFacade {
	/**
	 * 
	 * @Title: addBannerinfo
	 * @Description: 增加广告栏
	 * @param headMap  头信息
	 * @param bodyMap  上送报文
	 * @return
	 * @throws ServiceException
	 */
    public ResponseEntity addBannerinfo(Map<String,Object> headMap,Map<String, Object> bodyMap) throws ServiceException;
    
    /**
	 * 
	 * @Title: queryBannerinfo
	 * @Description: 广告栏查询
	 * @param headMap  头信息
	 * @param bodyMap  上送报文
	 * @return
	 * @throws ServiceException
	 */
    public ResponseEntity queryBannerinfo(Map<String,Object> headMap,Map<String, Object> bodyMap) throws ServiceException;
    
    /**
	 * 
	 * @Title: updateBannerinfo 
	 * @Description: 修改广告栏
	 * @param headMap  头信息
	 * @param bodyMap  上送报文
	 * @return
	 * @throws ServiceException
	 */
    public ResponseEntity updateBannerinfo(Map<String,Object> headMap,Map<String, Object> bodyMap) throws ServiceException;
    /**
	 * 
	 * @Title: deleteBannerinfo 
	 * @Description: 删除广告栏
	 * @param headMap  头信息
	 * @param bodyMap  上送报文
	 * @return
	 * @throws ServiceException
	 */
    public ResponseEntity deleteBannerinfo(Map<String,Object> headMap,Map<String, Object> bodyMap) throws ServiceException;
   
}

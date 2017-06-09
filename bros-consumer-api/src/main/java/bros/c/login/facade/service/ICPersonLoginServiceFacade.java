package bros.c.login.facade.service;

import java.util.Map;

import bros.common.core.entity.ResponseEntity;
import bros.common.core.exception.ServiceException;

/**
 * 
 * @ClassName: ICPersonLoginServiceFacade 
 * @Description: 个人登录服务消费方接口
 * @author huangcanhui 
 * @date 2016年10月10日 下午5:41:27 
 * @version 1.0
 */
public interface ICPersonLoginServiceFacade {
   
	/**
	 * 
	 * @Title: login 
	 * @Description: 登录
	 * @param headMap 报文头数据集合
	 * @param bodyMap 报文体数据集合
	 * @return ResponseEntity 返回结果对象
	 * @throws ServiceException
	 */
    public ResponseEntity login(Map<String,Object> headMap, Map<String,Object> bodyMap) throws ServiceException;
   
    /**
     * 
     * @Title: logout 
     * @Description: 签退
     * @param headMap 报文头数据集合
     * @param bodyMap 报文体数据集合
     * @return ResponseEntity 返回结果对象
     * @throws ServiceException
     */
    public ResponseEntity logout(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;
    
    /**
     * 
     * @Title: firstLogin 
     * @Description: 首次登录
     * @param headMap 报文头数据集合
     * @param bodyMap 报文体数据集合
     * @return ResponseEntity 返回结果对象
     * @throws ServiceException
     */
    public ResponseEntity firstLogin(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;
    
    /**
     * 
     * @Title: pauseLogin 
     * @Description: 临时停用登录
     * @param headMap 报文头数据集合
     * @param bodyMap 报文体数据集合
     * @return ResponseEntity 返回结果对象
     * @throws ServiceException
     */
    public ResponseEntity pauseLogin(Map<String, Object> headMap, Map<String, Object> bodyMap) throws ServiceException;
    
}

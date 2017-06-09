package bros.p.monitor.service;

import java.util.List;
import java.util.Map;

import bros.common.core.exception.ServiceException;

/**
 * 
 * @ClassName: IPApplicationAliveMonitorAccountServiceFacade 
 * @Description: 监听bros-provider-account模块是否存活
 * @author 何鹏
 * @date 2016年12月19日 上午10:06:05 
 * @version 1.0
 */
public interface IPApplicationAliveMonitorAccountServiceFacade {
	/**
	 * 
	 * @Title: applicationAliveMonitorMethod 
	 * @Description: 监听应用是否存活
	 * @param headMap
	 * @param bodyMap
	 * @return
	 * @throws ServiceException
	 */
	public List<Map<String,Object>> applicationAliveMonitorMethod(Map<String, Object> headMap,Map<String, Object> bodyMap) throws ServiceException;
}
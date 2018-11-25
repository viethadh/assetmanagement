package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.DaoImpl;
import dao.IDao;
import lombok.Getter;
import model.Asset;

public class AssetAction extends ActionSupport implements ModelDriven<Asset>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	IDao<Asset, Long> assetDao = new DaoImpl<>();
	
	@Getter
	private Asset asset = new Asset();
	
	@Getter
	private List<Asset> assets = new ArrayList<>();
	
	@Override
	public Asset getModel() {
		// TODO Auto-generated method stub
		return asset;
	}
	
	public String list() {
		assets = assetDao.list(Asset.class);
		return SUCCESS;
	}
}

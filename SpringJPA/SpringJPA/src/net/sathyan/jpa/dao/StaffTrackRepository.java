package net.sathyan.jpa.dao;

import java.io.Serializable ;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor ;
import org.springframework.data.repository.NoRepositoryBean ;

/**
 * Repository : SystemSetting.
 */

@NoRepositoryBean
public interface StaffTrackRepository<T, ID extends Serializable>
	extends JpaRepository<T, ID>,
			JpaSpecificationExecutor<T>
{
	
}

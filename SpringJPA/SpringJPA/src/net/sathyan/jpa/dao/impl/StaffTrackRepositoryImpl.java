package net.sathyan.jpa.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import net.sathyan.jpa.dao.StaffTrackRepository;

/**
	 * Base Repository Implementation
	 */
	public class StaffTrackRepositoryImpl<T, ID extends Serializable>
		implements StaffTrackRepository<T, ID>
	{
		private SimpleJpaRepository<T, ID> jpaRepository;

		private JpaEntityInformation<T, ?> entityInformation;
		//private @Inject EntityManager entityManager;
		@PersistenceContext(type = PersistenceContextType.EXTENDED)
		private EntityManager entityManager;


		public StaffTrackRepositoryImpl()
		{
			entityInformation = null;
			entityManager = null;
		}


		public StaffTrackRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager)
		{
			this.entityInformation = entityInformation;
			this.entityManager = entityManager;
		}


		public StaffTrackRepositoryImpl(Class<T> domainClass, EntityManager em)
		{
			this( JpaEntityInformationSupport.getEntityInformation( domainClass, em ), em );
		}


		/*
		 * Private implementation
		 */
		@PostConstruct
		private void init( )
		{
			// this is needed to retrieve the Class instance associated with the generic definition T
			ParameterizedType superclass = (ParameterizedType)getClass().getGenericSuperclass();
			Class<T> type = (Class<T>)superclass.getActualTypeArguments()[0];
			entityInformation = getEntityInformation( type );
		}


		@SuppressWarnings("unchecked")
		private <T, ID extends Serializable> JpaEntityInformation<T, ID> getEntityInformation( Class<T> domainClass )
		{

			return (JpaEntityInformation<T, ID>)JpaEntityInformationSupport.getEntityInformation( domainClass, entityManager );
		}


		/*
		 * getters and setters
		 */
		public JpaEntityInformation<T, ?> getEntityInformation( )
		{
			return entityInformation;
		}


		public EntityManager getEntityManager( )
		{
			return entityManager;
		}


		public SimpleJpaRepository<T, ID> getJpaRepository( )
		{
			if ( jpaRepository == null )
				jpaRepository = new SimpleJpaRepository<T, ID>( entityInformation, entityManager );

			return jpaRepository;
		}


		public void setJpaRepository( SimpleJpaRepository<T, ID> jpaRepository )
		{
			this.jpaRepository = jpaRepository;
		}



		
		
		/**
		 * This is a method that can be called when need to execute any SQL with /without parameters and where the results need to be
		 * mapped to a VO. resultmapping attribute is to be defined in any Entity 
		 * @param sqlStmt
		 * @param queryParams
		 * @param resultMapping
		 * @return
		 */
		
		@SuppressWarnings("unchecked")
		public List<T> executeNativeQueryMapResults( String sqlStmt, Map<String, Object> queryParams, String resultMapping )
		{
			Query nativeQuery = null ;

			
				nativeQuery = getEntityManager().createNativeQuery( sqlStmt, resultMapping) ;

				if ( nativeQuery != null )
				{
	 
					// add parameters
					if ( queryParams != null )
					{
						for ( String queryParamName : queryParams.keySet() )
						{
							Object queryParamValue = queryParams.get( queryParamName );
							nativeQuery.setParameter( queryParamName, queryParamValue );
						}
					}
				}
				
				nativeQuery.setFirstResult(0);
				nativeQuery.setMaxResults(10);
			
			return ( nativeQuery == null ) ? null : nativeQuery.getResultList();
		}


		@Override
		public List<T> findAll() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<T> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<T> findAllById(Iterable<ID> ids) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public <S extends T> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void deleteInBatch(Iterable<T> entities) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public T getOne(ID id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Page<T> findAll(org.springframework.data.domain.Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Optional<T> findById(ID id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public boolean existsById(ID id) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public void deleteById(ID id) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void delete(T entity) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void deleteAll(Iterable<? extends T> entities) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public <S extends T> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> Page<S> findAll(Example<S> example, org.springframework.data.domain.Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public <S extends T> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public <S extends T> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public Optional<T> findOne(Specification<T> spec) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<T> findAll(Specification<T> spec) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Page<T> findAll(Specification<T> spec, org.springframework.data.domain.Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<T> findAll(Specification<T> spec, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public long count(Specification<T> spec) {
			// TODO Auto-generated method stub
			return 0;
		}
	}


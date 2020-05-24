/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

/**
 * Generic JPA DAO class that provides JPA support for the entity class
 * specified.
 *
 * @param <T> the type of the entity class
 */
public abstract class GenericJpaDao<T> {public static class __CLR4_3_1e3e3kajqy8wy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0069\u0072\u006c\u006f\u0073\u0079\u006f\u0075\u0073\u0065\u0066\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u0046\u0069\u006e\u0061\u006c\u002d\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590245230253L,8589935092L,530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Class<T> entityClass;
    protected EntityManager entityManager;

    /**
     * Constructs a {@code GenericJpaDao} object.
     *
     * @param entityClass the {@link Class} object that represents the entity
     *                    class
     */
    public GenericJpaDao(Class<T> entityClass) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(507);
        __CLR4_3_1e3e3kajqy8wy.R.inc(508);this.entityClass = entityClass;
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Returns the underlying {@link EntityManager} instance.
     *
     * @return the underlying {@link EntityManager} instance
     */
    public EntityManager getEntityManager() {try{__CLR4_3_1e3e3kajqy8wy.R.inc(509);
        __CLR4_3_1e3e3kajqy8wy.R.inc(510);return entityManager;
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Sets the underlying {@link EntityManager} instance.
     *
     * @param entityManager the underlying {@link EntityManager} instance
     */
    public void setEntityManager(EntityManager entityManager) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(511);
        __CLR4_3_1e3e3kajqy8wy.R.inc(512);this.entityManager = entityManager;
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Persists the specified entity instance in the database.
     *
     * @param entity the entity instance to be persisted in the database
     */
    public void persist(T entity) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(513);
        __CLR4_3_1e3e3kajqy8wy.R.inc(514);entityManager.getTransaction().begin();
        __CLR4_3_1e3e3kajqy8wy.R.inc(515);entityManager.persist(entity);
        __CLR4_3_1e3e3kajqy8wy.R.inc(516);entityManager.getTransaction().commit();
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Returns the entity instance with the specified primary key from the
     * database. The method returns an empty {@link Optional} object when
     * the instance does not exists.
     *
     * @param primaryKey the primary key to look for
     * @return an {@link Optional} object wrapping the entity instance with
     * the specified primary key
     */
    public Optional<T> find(Object primaryKey) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(517);
        __CLR4_3_1e3e3kajqy8wy.R.inc(518);return Optional.ofNullable(entityManager.find(entityClass, primaryKey));
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Returns the list of all instances of the entity class from the database.
     *
     * @return the list of all instances of the entity class from the database
     */
    public List<T> findAll() {try{__CLR4_3_1e3e3kajqy8wy.R.inc(519);
        __CLR4_3_1e3e3kajqy8wy.R.inc(520);TypedQuery<T> typedQuery = entityManager.createQuery("FROM " + entityClass.getSimpleName(), entityClass);
        __CLR4_3_1e3e3kajqy8wy.R.inc(521);return typedQuery.getResultList();
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Removes the specified entity instance from the database.
     *
     * @param entity the entity instance to be removed from the database
     */
    public void remove(T entity) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(522);
        __CLR4_3_1e3e3kajqy8wy.R.inc(523);entityManager.getTransaction().begin();
        __CLR4_3_1e3e3kajqy8wy.R.inc(524);entityManager.remove(entity);
        __CLR4_3_1e3e3kajqy8wy.R.inc(525);entityManager.getTransaction().commit();
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

    /**
     * Updates the specified entity instance in the database.
     *
     * @param entity the entity instance to be updated in the database
     */
    public void update(T entity) {try{__CLR4_3_1e3e3kajqy8wy.R.inc(526);
        __CLR4_3_1e3e3kajqy8wy.R.inc(527);entityManager.getTransaction().begin();
        __CLR4_3_1e3e3kajqy8wy.R.inc(528);entityManager.merge(entity);
        __CLR4_3_1e3e3kajqy8wy.R.inc(529);entityManager.getTransaction().commit();
    }finally{__CLR4_3_1e3e3kajqy8wy.R.flushNeeded();}}

}

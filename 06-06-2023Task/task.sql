Multiple Column subquery:
select empno,ename,mgr,deptno from emp where (mgr,deptno) in
(select mgr,deptno from emp where empno in(7566,7788));
 
select mgr,deptno from emp where empno in(7566,7788);

select empno,ename,deptno,sal from emp where sal >ANY(select sal from emp where empno in(7566,7788));

select empno,ename,deptno,sal from emp where sal <ANY(select sal from emp where empno in(7566,7788));

select empno,ename,deptno,sal from emp where sal <ALL(select sal from emp where empno in (7566,7788));

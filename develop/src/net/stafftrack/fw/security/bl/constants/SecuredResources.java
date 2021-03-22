/*
 * Created on Aug 22, 2003
 *
 */
package net.stafftrack.fw.security.bl.constants;

/**
 * This interface is a representation of LT_SECURED_RESOURCES table
 * <p><b> Do not change this interface without modifying database - we have to
 * keep those things in sync. </b></p>
 * I used SQL to generate this file
 * @see sql\fetch secured resources.sql for source)
 * 
 * @author George Michelson
 * 
 * @version $Revision: 1.389 $
 * 
 * $Log: SecuredResources.java,v $
 * Revision 1.389  2018/08/28 11:12:53  anthony
 * SMSTN-14331 : SIMOS: Attendance Bonus Eligibility Report
 *
 * Revision 1.388  2018/08/22 05:29:42  nagaraj
 * SMSTN-13647
 *
 * Revision 1.387  2018/07/31 04:32:59  nagaraj
 * SMSTN-14224
 *
 * Revision 1.386  2018/07/30 08:09:22  nagaraj
 * SMSTN-14224
 *
 * Revision 1.385  2018/07/27 14:52:58  venij
 * SMSTN-14118 - Management Report - new secured resource
 *
 * Revision 1.384  2018/07/11 06:35:39  nagaraj
 * SMSTN-14034
 *
 * Revision 1.383  2018/06/07 08:40:21  nagaraj
 * SMSTN-14067
 *
 * Revision 1.382  2018/05/29 06:26:54  nagaraj
 * SMSTN-14036
 *
 * Revision 1.381  2018/05/23 10:59:33  anthony
 * SMSTN-14036 : SIMOS: Paid Holiday - changes related to report
 *
 * Revision 1.380  2018/05/21 11:48:42  venij
 * SMSTN-14036 - fixed in HEAD
 *
 * Revision 1.379  2018/05/16 22:25:12  ptheis
 * SMSTN-13757  SIMOS: Expand ST to handle multiple Brands:
 * Add modified security codes component.
 *
 * Revision 1.378  2018/05/16 09:46:53  nagaraj
 * SMSTN:13576
 *
 * Revision 1.377  2018/05/11 06:18:44  anthony
 * SMSTN-14011 - Fixed
 *
 * Revision 1.376  2018/01/22 04:58:19  nagaraj
 * SMSTN:13566
 *
 * Revision 1.375  2018/01/16 03:34:34  nagaraj
 * SMSTN:13357 : roll back
 *
 * Revision 1.374  2017/11/29 07:38:12  anthony
 * SMSTN-13261
 *
 * Revision 1.373  2017/11/29 07:13:55  nagaraj
 * SMSTN:13261
 *
 * Revision 1.372  2017/11/27 17:12:35  caclark
 * SMSTN-13128: Standardized use of job_code from OFFICE_APPLICANT_JOB_REQS
 *
 * Revision 1.371  2017/11/24 06:08:17  nagaraj
 * SMSTN:13357
 *
 * Revision 1.370  2017/11/08 11:02:12  venij
 * SMSTN-13286 - updated changes
 *
 * Revision 1.369  2017/10/24 07:27:16  nagaraj
 * SMSTN:13261
 *
 * Revision 1.368  2017/09/20 09:19:05  nagaraj
 * SMSTN:13215
 *
 * Revision 1.367  2017/09/15 07:31:27  nagaraj
 * SMSTN:13181
 *
 * Revision 1.366  2017/09/12 05:29:53  nagaraj
 * SMSTN:13146
 *
 * Revision 1.365  2017/09/07 07:08:08  nagaraj
 * SMSTN:13146
 *
 * Revision 1.364  2017/08/24 10:17:29  nagaraj
 * SMSTN:13109
 *
 * Revision 1.363  2017/08/11 08:39:24  nagaraj
 * SMSTN:13001
 *
 * Revision 1.362  2017/06/30 03:28:53  sathyan
 * SMSTN-12743  : Added Java code
 *
 * Revision 1.361  2017/06/29 19:59:05  caclark
 * SMSTN-12743: temporary fix to add missing MYSTN_HOURS_APPROVAL_CONFIG
 *
 * Revision 1.360  2017/06/08 04:45:14  anthony
 * SMSTN-12550 : Analytics Tab and Office Scorecard
 *
 * Revision 1.359  2017/06/06 11:55:45  anthony
 * SMSTN-12550 : Analytics Tab and Office Scorecard
 *
 * Revision 1.358  2017/05/31 07:54:27  nagaraj
 * SMSTN:12502
 *
 * Revision 1.357  2017/05/23 09:36:01  anthony
 * SMSTN-12551-Auto Communication
 *
 * Revision 1.356  2017/05/15 10:15:40  anthony
 * 1.	SMSTN-12552 : Media Cost Phase 2
 *
 * Revision 1.355  2017/03/20 04:05:42  venij
 * SMSTN-12431 : added secured resource
 *
 * Revision 1.354  2017/02/28 08:05:50  anthony
 * SMSTN-12343
 *
 * Revision 1.353  2017/02/20 04:59:55  nagaraj
 * SMSTN:12231
 *
 * Revision 1.352  2017/02/15 09:38:27  nagaraj
 * SMSTN:12231
 *
 * Revision 1.351  2017/02/08 05:11:52  nagaraj
 * SMSTN:12012
 *
 * Revision 1.350  2017/02/03 05:23:59  anthony
 * SMSTN-12231 : National Media Cost and Tracking
 *
 * Revision 1.349  2017/01/30 02:38:18  cbclark
 * SMSTN-12134 : Skills Test Audit Report
 *
 * Revision 1.348  2017/01/25 07:44:33  nagaraj
 * SMSTN:12012
 *
 * Revision 1.347  2016/12/22 04:48:03  anthony
 * SMSTN-12012 : WOTC integration with ADP - Additional Forms
 *
 * Revision 1.346  2016/11/30 16:23:27  cbclark
 * SMSTN:12012
 *
 * Revision 1.345  2016/10/18 10:07:38  anthony
 * SMSTN-11975 : Opt Out of XML Feed for Non Advertising Sites
 *
 * Revision 1.344  2016/10/13 08:12:11  nagaraj
 * SMSTN:11975
 *
 * Revision 1.343  2016/10/13 05:07:11  nagaraj
 * SMSTN:11975
 *
 * Revision 1.342  2016/05/25 10:35:49  venij
 * SMSTN-11647-new secured resource
 *
 * Revision 1.341  2016/05/20 04:42:44  nagaraj
 * jira 11648 : Report writer new functionality 2016
 *
 * Revision 1.340  2016/04/12 05:45:35  anthony
 * UC-TCPA Requirements
 *
 * Revision 1.338  2016/03/03 09:44:38  anthony
 * 1.	UC-Field Glass phase II
 *
 * Revision 1.337  2016/02/26 07:16:17  anthony
 * SOX - Add Missing Hr Documents(Bug # : 11397)
 *
 * Revision 1.336  2015/12/01 04:46:39  anthony
 * SOX Compliance � Manual Uploads
 *
 * Revision 1.335  2015/10/19 10:55:58  anthony
 * PRO Mobile 2015
 *
 * Revision 1.334  2015/09/23 07:25:26  anthony
 * PRO Mobile 2015 - NM Changes
 *
 * Revision 1.333  2015/09/01 05:40:27  anthony
 * UC - Sick Time Off
 *
 * Revision 1.332  2015/08/05 19:29:36  cbclark
 * Issue #10892: TempWorks UC - Associate Info and WO Transfer. Secure the Resend to TW and Associate Transfer to TW links.
 *
 * Revision 1.331  2015/08/03 05:16:10  sathyan
 * TempWorks Upgrade : Payroll Changes merged
 *
 * Revision 1.330  2015/08/01 09:22:39  nagaraj
 * adp wotc integration usecase
 *
 * Revision 1.329  2015/07/02 10:34:45  venij
 * UC - Auto Termination - new secured resource
 *
 * Revision 1.328  2015/05/18 05:18:00  nagaraj
 * adp wotc integration usecase
 *
 * Revision 1.327  2015/04/24 06:50:00  anthony
 * Manually Changed Tables - Associate Document Date edit
 *
 * Revision 1.326  2015/04/22 07:41:14  nagaraj
 * pro 2015 enhancements usecase
 *
 * Revision 1.325  2015/04/14 07:49:10  anthony
 * Data Changes to tables - Generate Cumulative Hours - Secured Resources is added
 *
 * Revision 1.324  2015/04/14 07:38:47  nagaraj
 * usecase:inactivate sdlp
 *
 * Revision 1.323  2015/04/01 06:03:56  venij
 * UC - Order Forecast - secured resource
 *
 * Revision 1.322  2015/04/01 05:53:31  anthony
 * Bug # SMSTN-10856
 *
 * Revision 1.321  2015/03/27 06:42:25  anthony
 * Manual Data Uploads � Office Everify Configs
 *
 * Revision 1.320  2015/03/26 10:49:40  venij
 * UC - Payroll Regenerate Invoice - code changes
 *
 * Revision 1.319  2015/03/25 05:29:20  venij
 * UC - Payroll Regenerate Invoice - new secured resource
 *
 * Revision 1.318  2015/03/10 11:52:03  anthony
 * Bug Fix 10331
 *
 * Revision 1.317  2015/03/10 11:35:07  venij
 * Payroll file link role based changes-previous commit was for this one
 *
 * Revision 1.316  2015/03/10 11:30:32  venij
 * 9813:new secured resource
 *
 * Revision 1.315  2015/02/23 10:28:16  nagaraj
 * usecase :db prod changes
 *
 * Revision 1.314  2015/02/19 10:18:38  anthony
 * UC - Field Glass Integration
 *
 * Revision 1.313  2015/02/19 05:52:34  venij
 * UC - Field Glass Integration - updated code
 *
 * Revision 1.312  2015/02/12 04:20:59  nagaraj
 * field glass integration usecase
 *
 * Revision 1.311  2015/02/02 08:25:34  nagaraj
 * field glass integration usecase
 *
 * Revision 1.310  2015/01/14 09:02:34  nagaraj
 * manual run auto jobs
 *
 * Revision 1.309  2014/12/17 05:56:32  nagaraj
 * 10716
 *
 * Revision 1.308  2014/11/26 10:24:26  venij
 * Split and Save-Replace in ST- NCD Import Documents list page-removed unused code
 *
 * Revision 1.307  2014/10/20 08:50:13  venij
 * Split and Save-Replace in ST- new secured resource
 *
 * Revision 1.306  2014/09/19 05:16:13  anthony
 * PRD START Associate : Secured Resources
 *
 * Revision 1.305  2014/09/16 19:49:02  eaustin1
 * PAN UI Changes - LM Office - External Testing Vendor Config Changes
 *
 * Revision 1.304  2014/06/09 09:42:00  anthony
 * UC-New PayTypes - Payroll New Pay Types UI Changes
 *
 * Revision 1.303  2014/06/06 20:11:58  eaustin1
 * Changes for SIN Canada and Quest Import
 *
 * Revision 1.302  2014/06/06 04:56:35  nagaraj
 * usecase:mass scheduling
 *
 * Revision 1.301  2014/05/26 06:37:27  nagaraj
 * UC_V14_PAYROLL_GENERAL
 *
 * Revision 1.300  2014/05/26 04:35:05  nagaraj
 * UC_V14_PAYROLL_GENERAL
 *
 * Revision 1.299  2014/03/20 07:45:43  nagaraj
 * usecase : associate photos
 *
 * Revision 1.298  2014/03/17 07:10:36  venij
 * UC-Associate Photos-renamed resource name
 *
 * Revision 1.297  2014/03/14 05:07:51  nagaraj
 * WFM-Additional Change
 *
 * Revision 1.296  2014/03/10 08:49:24  venij
 * UC-Associate Photos-new resource
 *
 * Revision 1.295  2014/02/11 08:22:23  sathyan
 * UC-Workforce-General
 *
 * Revision 1.294  2014/01/29 10:48:25  venij
 * UC-Workforce-secured resource for crewdesk workforce sub tab
 *
 * Revision 1.293  2014/01/29 10:47:40  venij
 * UC-Workforce-secured resource for crewdesk workforce sub tab
 *
 * Revision 1.292  2013/12/16 11:34:18  venij
 * Rehireable Status Update UC - new secured resource
 *
 * Revision 1.291  2013/12/04 06:06:13  nagaraj
 * Applicant Data Discrepancy UC
 *
 * Revision 1.290  2013/12/02 08:20:03  sathyan
 * Applicant Data Discrepancy UC
 *
 * Revision 1.289  2013/11/21 06:57:15  venij
 * Applicant Data Discrepancy UC - new secured resource for associate data discrepancy report
 *
 * Revision 1.288  2013/09/20 07:08:24  sathyan
 * 9861
 *
 * Revision 1.287  2013/08/22 11:08:41  venij
 * 9835 - fixes
 *
 * Revision 1.286  2013/05/09 20:54:41  cbclark
 * Bug #9669: Add a Reject button to the I9 Manager Review page.  Add a new PRO Take Action -- NCD Rejected I9s.
 *
 * Revision 1.285  2013/04/29 03:51:23  nagaraj
 * aar group editing : in progress
 *
 * Revision 1.284  2013/02/06 09:54:09  venij
 * VMS Redistribute Orders use case
 *
 * Revision 1.283  2013/01/08 04:53:37  nagaraj
 * hsn prod tracking
 *
 * Revision 1.282  2012/12/28 09:58:42  venij
 * HSN Productivity use case - secured resource
 *
 * Revision 1.281  2012/12/27 11:29:20  nagaraj
 * hsn prod tracking
 *
 * Revision 1.280  2012/12/26 06:35:59  venij
 * HSN Productivity use case - secured resource for subtab
 *
 * Revision 1.279  2012/12/12 09:48:21  venij
 * Recruiting report use case - DataTrack tab
 *
 * Revision 1.278  2012/12/05 08:36:38  sathyan
 * 9347: Fixed
 *
 * Revision 1.277  2012/11/28 08:21:28  sathyan
 * Payroll File Changes
 *
 * Revision 1.276  2012/10/15 07:17:18  venij
 * Recruiting Report - secured resource
 *
 * Revision 1.275  2012/10/12 07:10:26  venij
 * Configure IP address for office - secured resource
 *
 * Revision 1.274  2012/10/11 05:09:52  venij
 * Recruiting Report - secured resource
 *
 * Revision 1.273  2012/10/09 08:46:39  nagaraj
 * ssn visibility usecase
 *
 * Revision 1.272  2012/09/04 08:32:12  nagaraj
 * global cashcard usecase
 *
 * Revision 1.271  2012/07/13 06:47:41  venij
 * PRO Offline - Most Recent STN Imports task
 *
 * Revision 1.270  2012/05/23 07:21:14  venij
 * VMS-R4 Time in MySTN - Associate Time Report.
 *
 * Revision 1.269  2012/04/27 07:46:14  nagaraj
 * time in mystn usecase
 *
 * Revision 1.268  2012/04/13 08:55:11  nagaraj
 * time in mystn usecase
 *
 * Revision 1.267  2012/02/15 08:51:50  venij
 * PRO DH Live Chat - new secured resource
 *
 * Revision 1.266  2011/12/12 06:51:59  sathyan
 * Missing Unitime Punches
 *
 * Revision 1.265  2011/10/07 07:29:23  venij
 * 8647 : new secured resource
 *
 * Revision 1.264  2011/08/01 05:18:38  venij
 * 8521 : fixed.
 *
 * Revision 1.263  2011/07/29 09:49:09  nagaraj
 * assoc docs missing
 *
 * Revision 1.262  2011/07/27 12:21:40  venij
 * Missing Docs Take action : added new secured resource for take action subtab in crewdesk
 *
 * Revision 1.261  2011/07/22 12:33:01  venij
 * Risk Console : added new secured resource for subtab in crewdesk
 *
 * Revision 1.260  2011/06/01 07:05:53  venij
 * 8241 : fixed.
 *
 * Revision 1.259  2011/05/23 05:46:23  nagaraj
 * new secured resource for drugtest to be edited by stn
 *
 * Revision 1.258  2011/05/03 08:39:55  venij
 * PRO - Recruiter Interview - new secured resource.
 *
 * Revision 1.257  2011/04/27 06:11:56  venij
 * PRO - Associate Documents page - new resource
 *
 * Revision 1.256  2011/04/21 04:00:50  nagaraj
 * pro:client audits
 *
 * Revision 1.255  2011/04/16 10:34:08  sshivarudrappa
 * Modified the files for document_template security check and to get the list of US states for State W4 document template sub type.
 *
 * Revision 1.254  2011/04/15 12:25:29  nagaraj
 * pro
 *
 * Revision 1.253  2011/04/15 03:51:39  venij
 * PRO - Job Code Configuration - new secured resource.
 *
 * Revision 1.252  2011/03/23 09:39:39  sshivarudrappa
 * Termination Report Code Changes for 8108 (merged)
 *
 * Revision 1.251.2.1  2011/03/23 07:11:07  sathyan
 * 8108 : Fixed
 *
 * Revision 1.251  2010/12/22 09:54:10  sathyan
 * Vendor Attaches Resources
 *
 * Revision 1.250  2010/11/22 05:38:32  nagaraj
 * Amazon caar import design
 *
 * Revision 1.249  2010/11/11 06:08:20  nagaraj
 * Amazon caar import design
 *
 * Revision 1.248  2010/09/24 06:31:10  sathyan
 * AMZ: WHITEBOARD REPORT
 *
 * Revision 1.247  2010/09/21 08:52:20  sathyan
 * AMZ: WHITEBOARD REPORT
 *
 * Revision 1.246  2010/09/20 04:02:09  sathyan
 * Added Secured resource for Office CAMR import
 *
 * Revision 1.245  2010/09/17 09:45:23  venij
 * AMZ Fill to start date(whiteboard) - new resource
 *
 * Revision 1.244  2010/09/15 13:32:14  mani
 * VMS - R2 - Undistributed Orders.
 *
 * Revision 1.243  2010/09/15 10:43:42  sathyan
 * AMZ: CAMR IMPORT CODE
 *
 * Revision 1.242  2010/09/15 06:47:41  sathyan
 * Added VendorDashboard Security
 *
 * Revision 1.241  2010/09/14 11:00:58  venij
 * AMZ Fill to start date(whiteboard) - new resource for new subtab.
 *
 * Revision 1.240  2010/09/01 18:23:27  mani
 * 7769: Fixed.
 *
 * Revision 1.239  2010/07/29 06:00:38  venij
 * I9everifyV20 - new secured resource
 *
 * Revision 1.238  2010/07/28 11:47:01  venij
 * I9everifyV20 - new secured resource
 *
 * Revision 1.237  2010/06/28 07:07:37  nagaraj
 * mystn rewrite : server side for ZK
 *
 * Revision 1.236  2010/06/09 09:31:56  nagaraj
 * vms-release1
 *
 * Revision 1.235  2010/05/28 05:43:44  nagaraj
 * vms-release1:gwt
 *
 * Revision 1.234  2010/05/27 05:21:41  mani
 * eVerify V20 - Merged.
 *
 * Revision 1.233  2010/04/06 09:16:34  nagaraj
 * amazon performance management reports
 *
 * Revision 1.232  2010/03/19 11:56:17  venij
 * Amazon PM Config : new secured resource
 *
 * Revision 1.231  2010/03/01 09:46:44  venij
 * O2I:audit grp by CR:added new resource
 *
 * Revision 1.230  2010/02/12 10:26:26  sathyan
 * 7383:fixed
 *
 * Revision 1.229  2010/02/04 08:51:00  nagaraj
 * o2i: order change reasons
 *
 * Revision 1.228  2009/11/25 09:00:48  sathyan
 * Hours report
 *
 * Revision 1.227  2009/11/20 15:57:22  timp
 * Bug #7078 - Reporting and security constants added for OrdersReport functionality
 *
 * Revision 1.226  2009/10/27 06:51:34  nagaraj
 * Office files
 *
 * Revision 1.225  2009/10/26 07:09:10  nagaraj
 * 7106
 *
 * Revision 1.224  2009/10/13 09:16:02  nagaraj
 * Replace Existing MySTN - Links Design
 *
 * Revision 1.223  2009/09/22 18:17:03  venij
 * Invoice to Order - Order Config - web layer code.
 *
 * Revision 1.222  2009/09/14 13:41:29  mani
 * Order To Invoce Security Roles V1 - Coding is in progress.
 *
 * Revision 1.221  2009/09/07 11:56:18  mani
 * Order To Invoce Security Roles V1 - Coding is in progress.
 *
 * Revision 1.220  2009/08/31 06:57:02  nagaraj
 * 6983
 *
 * Revision 1.219  2009/08/28 10:49:06  nagaraj
 * cum hours design
 *
 * Revision 1.218  2009/08/06 05:14:06  nagaraj
 * 6912
 *
 * Revision 1.217  2009/08/04 18:03:24  mani
 * Lock Hours Edit - Coding
 *
 * Revision 1.216  2009/07/24 03:06:13  timp
 * enhancement #6894 - e-verify take actions
 *
 * Revision 1.215  2009/07/15 07:24:49  nagaraj
 * assoc_bg_check_head
 *
 * Revision 1.214  2009/07/15 07:10:04  nagaraj
 * ordered the resources correctly
 *
 * Revision 1.213  2009/07/14 04:52:23  mani
 * Weekly WO Audit: Integration Code.
 *
 * Revision 1.212  2009/07/13 12:33:46  mani
 * Weekly WO Audit: Report Server Code.
 *
 * Revision 1.211  2009/07/10 05:46:12  nagaraj
 * assoc_bg_check_head
 *
 * Revision 1.210  2009/07/07 06:09:23  nagaraj
 * 6819
 *
 * Revision 1.209  2009/07/06 11:32:54  nagaraj
 * 6804
 *
 * Revision 1.208  2009/06/24 13:52:08  mani
 * I9 Bugs: Fixed.
 *
 * Revision 1.207  2009/06/07 18:19:07  mani
 * Weekly WO Audit - Facade Bean.
 *
 * Revision 1.206  2009/05/29 11:00:35  venij
 * Weekly WO # audit: added secured resources, web layer code is in progress.
 *
 * Revision 1.205  2009/05/22 06:26:06  nagaraj
 * EverifyV17
 *
 * Revision 1.204  2009/04/17 12:56:50  mani
 * 6540: Fixed.
 *
 * Revision 1.203  2009/04/15 06:08:00  venij
 * Doc Merge SSN change audit report : added new secured resource.
 *
 * Revision 1.202  2009/03/20 06:15:51  venij
 * New STN roles : added new secured resource for Convert Associate link
 *
 * Revision 1.201  2009/03/18 08:34:57  venij
 * Sched week payroll billings - added secured resource.
 *
 * Revision 1.200  2009/03/12 09:26:31  sathyan
 * New Secured resource ASSOC_DED_BILLING
 *
 * Revision 1.199  2009/03/09 05:43:46  nagaraj
 * associate deduction and billing
 *
 * Revision 1.198  2009/03/06 08:54:53  venij
 * Office Deductions and Misc Billings - added new secured resources.
 *
 * Revision 1.197  2009/03/06 07:05:28  venij
 * Deductions and Billings - added new secured resource.
 *
 * Revision 1.196  2009/02/15 20:39:22  mani
 * Requirement Import - Work In progress.
 *
 * Revision 1.195  2009/01/21 07:47:44  nagaraj
 * bio print out
 *
 * Revision 1.194  2009/01/20 11:17:03  venij
 * WO upload to STN : added code for UI.
 *
 * Revision 1.193  2009/01/13 11:28:21  venij
 * Regenrate WO Req association : added code to access proc and java layer.
 *
 * Revision 1.192  2009/01/09 05:59:24  venij
 * Change password for everify : added new resource.
 *
 * Revision 1.191  2008/12/17 08:31:23  gokulane
 * New resource WORK_ORDER_TAGPAD
 *
 * Revision 1.190  2008/11/21 10:52:47  venij
 * Bug 5336: Added secured resources for report subtabs.
 *
 * Revision 1.189  2008/11/07 05:25:30  nagaraj
 * office wo client ref.mappings
 *
 * Revision 1.188  2008/11/04 05:51:45  nagaraj
 * office hours format - uc
 *
 * Revision 1.187  2008/10/31 04:55:04  nagaraj
 * attendance import
 *
 * Revision 1.186  2008/10/29 12:52:01  mani
 * Hours Import - List/View for Raw Data.
 *
 * Revision 1.185  2008/10/14 10:41:50  venij
 * Payroll - Take Action - Hours Comparision Mismatch.
 *
 * Revision 1.184  2008/10/02 11:08:35  venij
 * Taurus : Assoc Transfer � Phase 3 � Office Config
 *
 * Revision 1.183  2008/09/18 18:44:58  mani
 * 6086: Fixed.
 *
 * Revision 1.182  2008/09/18 11:13:40  venij
 * 5958:Fix:added new secured resource.
 *
 * Revision 1.181  2008/09/05 11:40:48  nagaraj
 * new resource for payroll config
 *
 * Revision 1.180  2008/09/05 10:09:29  nagaraj
 * new resource for payroll config
 *
 * Revision 1.179  2008/08/27 11:32:59  venij
 * Payroll Taurus - LM Manual Hours Configuration use case
 *
 * Revision 1.178  2008/08/12 11:24:29  sathyan
 * Added code for schedule payroll reports
 *
 * Revision 1.177  2008/07/25 03:53:34  nagaraj
 * for udf pickup list
 *
 * Revision 1.176  2008/06/29 19:49:09  mani
 * Reject Future Version new requirements Implemented.
 *
 * Revision 1.175  2008/06/20 17:53:28  mani
 * Transmit Payroll History.
 *
 * Revision 1.174  2008/06/11 06:59:14  nagaraj
 * for transmit payroll
 *
 * Revision 1.173  2008/06/10 13:12:43  mani
 * Transmit WO History.
 *
 * Revision 1.172  2008/06/02 14:09:05  gokulane
 * New Resouces added Assoc Payroll History & Previous Hours
 *
 * Revision 1.171  2008/05/31 03:48:31  sathyan
 * Added code for new secured recource entry for manual WO
 *
 * Revision 1.170  2008/05/30 04:36:00  nagaraj
 * for payroll wo report
 *
 * Revision 1.169  2008/05/27 04:30:42  nagaraj
 * for payroll audit report
 *
 * Revision 1.168  2008/05/23 10:49:23  nagaraj
 * for report security
 *
 * Revision 1.167  2008/05/23 06:52:06  sathyan
 * Added secured resourse for tempworks and payroll takeaction.
 *
 * Revision 1.166  2008/05/14 09:31:49  mani
 * Associate > Payroll > History Tile.
 *
 * Revision 1.165  2008/04/22 05:51:20  nagaraj
 * FOR ADD/EDIT BONUS HOURS
 *
 * Revision 1.164  2008/04/21 10:27:00  venij
 * Renamed secured resource for Associate Payroll records to follow 30 chars limit.
 *
 * Revision 1.163  2008/04/18 17:31:26  venij
 * Added new secured resource for Associate Payroll records.
 *
 * Revision 1.162  2008/04/17 07:29:25  nagaraj
 * for edit wo and hours
 *
 * Revision 1.161  2008/04/14 07:22:43  nagaraj
 * for module-payroll-current week and generic week
 *
 * Revision 1.160  2008/04/08 05:14:58  nagaraj
 * for associate-workorder-add edit wo
 *
 * Revision 1.159  2008/03/25 09:39:16  nagaraj
 * for workorder groups
 *
 * Revision 1.158  2008/03/24 08:23:42  sathyan
 * Added code for Payroll Markups.
 *
 * Revision 1.157  2008/03/20 11:42:26  mani
 * LM - Payroll - WO List
 *
 * Revision 1.156  2008/03/18 09:50:55  nagaraj
 * payroll-wo scheme
 *
 * Revision 1.155  2008/03/13 09:38:34  mani
 * Payroll - WO Client Reference - Task #996.
 *
 * Revision 1.154  2008/03/07 09:32:09  mani
 * Payroll - WO Client Reference - Task #994.
 *
 * Revision 1.153  2008/03/07 08:34:08  nagaraj
 * payroll-invoice groups
 *
 * Revision 1.152  2008/03/03 13:55:03  nagaraj
 * payroll-historical config
 *
 * Revision 1.151  2008/02/22 11:54:12  mani
 * STN Home Page - Coding.
 *
 * Revision 1.150  2008/02/14 18:07:28  mani
 * eVerify Multi Office Scheduled Report.
 *
 * Revision 1.149  2008/02/14 11:50:11  mani
 * New resources added.
 *
 * Revision 1.147  2008/02/14 09:14:03  mani
 * New Report Multi Office Scheduling.
 *
 * Revision 1.146  2008/02/13 13:54:37  mani
 * 5302:Fixed.
 *
 * Revision 1.145  2008/02/06 03:56:56  mani
 * I9 Verification.
 *
 * Revision 1.144  2008/01/31 13:01:00  mani
 * eVerify Validations.
 *
 * Revision 1.143  2008/01/20 10:56:31  mani
 * Security Issue: Roster Groups.
 *
 * Revision 1.142  2008/01/16 13:06:09  mani
 * 5232:Fixed.
 *
 * Revision 1.141  2008/01/07 15:42:11  mani
 * Secured Resources Descripancy.
 *
 * Revision 1.140  2008/01/07 12:13:17  mani
 * Secured Resources Descripancy.
 *
 * Revision 1.139  2008/01/02 11:20:13  sathyan
 * EVerify Reporting enteries
 *
 * Revision 1.138  2007/11/30 10:15:37  sathyan
 * 5.1F : Added constants needed for reports.
 *
 * Revision 1.137  2007/11/29 13:50:28  mani
 * 5.1 K: System Users Audit - Use Case Implemenation.
 *
 * Revision 1.136  2007/11/15 12:28:37  mani
 * body.jsp security fix. notauthorized security fix is done.
 *
 * Revision 1.135  2007/11/14 14:33:35  mani
 * Maintenance Web Layer Security fixes.
 *
 * Revision 1.134  2007/11/14 10:10:01  sathyan
 * SSN Security 5.1K : Added secured resource for Audit reports
 *
 * Revision 1.133  2007/11/14 05:06:14  sathyan
 * SSN Security 5.1K : Added secured resource
 *
 * Revision 1.132  2007/11/13 12:43:47  mani
 * Merging Transfer Associate - Local Maintenance.
 *
 * Revision 1.131  2007/11/13 10:01:16  sathyan
 * SSN Security 5.1K : Added new secured resource
 *
 * Revision 1.130  2007/11/13 03:53:28  venij
 * Security Audit:Fix:Updated fixes.
 *
 * Revision 1.129  2007/10/30 22:12:12  dans
 * new resource
 *
 * Revision 1.128  2007/10/26 12:58:37  mani
 * Security: Web Layer Fixes.
 *
 * Revision 1.127  2007/10/25 13:52:00  mani
 * Security: Web Layer Fixes.
 *
 * Revision 1.126  2007/10/24 13:20:50  mani
 * Security: Web Layer Fixes.
 *
 * Revision 1.125  2007/10/19 15:18:02  mani
 * Security Web Layer Fixes.
 *
 * Revision 1.123  2007/10/18 02:33:00  dans
 * security audit, changed added security so that all links, tiles, and tabs checked correctly
 *
 * Revision 1.122  2007/10/17 09:21:31  mani
 * Security Web Layer Fixes.
 *
 * Revision 1.121  2007/10/16 22:35:49  dans
 * added new resources MANAUAL_FILL_REVIEW AND MANUAL_SCHEDULING
 *
 * Revision 1.120  2007/10/12 06:23:17  venij
 * Security Audit:Fix:Added new resources for display of tiles on reports main page.
 *
 * Revision 1.119  2007/10/10 08:20:37  venij
 * Security Audit log:Fix:renamed resources for minor tabs.
 *
 * Revision 1.118  2007/10/10 05:44:44  venij
 * Security Audit:Fix:Updated fixes.
 *
 * Revision 1.117  2007/10/05 11:10:50  venij
 * Security Audit:Fix:Updated fixes.
 *
 * Revision 1.116  2007/10/05 10:46:47  venij
 * Security Audit:Fix:Updated fixes.
 *
 * Revision 1.115  2007/10/05 09:08:38  venij
 * Security Audit:Fix:Updated fixes.
 *
 * Revision 1.114  2007/10/05 08:59:30  mani
 * New resource added for LOCAL_ATTENDANCE_CODE.
 *
 * Revision 1.113  2007/10/04 11:48:10  mani
 * stafftrack_office_office_config security fixes. Web tier changes also there. But it needs to be reverified once again.
 *
 * Revision 1.111  2007/09/28 12:50:10  mani
 * stafftrack_location security fixes.
 *
 * Revision 1.110  2007/09/28 06:07:53  mani
 * Security Fixes: NotAuthorizedException is changes to asssociate module.
 *
 * Revision 1.109  2007/09/28 04:33:00  mani
 * stafftrack_associate security fixes. Review comments incorporated.
 *
 * Revision 1.108  2007/09/26 13:16:12  mani
 * stafftrack_associate security fixes.
 *
 * Revision 1.107  2007/07/25 23:17:10  dans
 * adde is client viewable
 *
 * Revision 1.106  2006/03/07 21:28:45  dans
 * 4199 - added missing report resources
 *
 * Revision 1.105  2006/02/06 16:58:23  dans
 * added email secured resource
 *
 * Revision 1.104  2006/01/17 09:22:07  sathyan
 * C120: Added the secured_resource entry for ps_import.
 *
 * Revision 1.103  2005/11/17 11:06:13  georgem
 * Fixed PS media code id to point ot right value in DB
 *
 * Revision 1.102  2005/10/14 09:51:33  sathyan
 * 3658: Fixed.
 *
 * Revision 1.101  2005/08/31 06:43:55  sathyan
 * Fixed the build problem. Added the security resource entry for Attendance Import
 *
 * Revision 1.100  2005/07/25 11:16:48  sathyan
 * B515: Change: Added the security resource entry
 *
 * Revision 1.99  2005/07/22 11:49:49  sathyan
 * B505: change: Added the security constants for Gantt scheduling
 *
 * Revision 1.98  2005/07/22 08:08:55  sathyan
 * B500: Change: Added security entry for Employee Schedues reports
 *
 * Revision 1.97  2005/07/19 03:23:25  sathyan
 * B330: Change: Added the secured resource for the Preschedule audit.
 *
 * Revision 1.96  2005/06/30 23:39:46  dmitriyb
 * WORK IN PROGRESS - Adding System Access maintenance
 *
 * Revision 1.95  2005/06/29 08:03:11  sathyan
 * B410: Change: Added the Secured resource for the bid card reports
 *
 * Revision 1.94  2005/06/27 12:30:17  sathyan
 * B460: Change: Added the secured resource  for the Bid Exception reports
 *
 * Revision 1.93  2005/06/24 16:08:55  dmitriyb
 * Added a secured resource for user role permissions
 *
 * Revision 1.92  2005/06/24 11:40:39  sathyan
 * B455: Change: Added the secured resource for the Missing Bid Aging Reports
 *
 * Revision 1.91  2005/06/20 23:58:44  georgem
 * Modfying security system to be data-driven
 *
 * Revision 1.90  2005/06/18 06:31:08  sathyan
 * B430: Change: Added secured resources for the flex rosters
 *
 * Revision 1.89  2005/06/13 12:36:07  sathyan
 * B445: Change: Added secured resource  for the EMployee_hours
 *
 * Revision 1.88  2005/06/09 22:46:50  georgem
 * Changing security system - changed logic of checked for local roles
 *
 * Revision 1.87  2005/06/06 12:34:25  sathyan
 * X101: Change: Added the secured resource for orientation rosters Report
 *
 * Revision 1.86  2005/05/30 11:35:20  sathyan
 * B655: Added secured resource for Associate Hierarchy
 *
 * Revision 1.85  2005/05/27 11:28:24  sathyan
 * B660: Change: Added secured resource for General Config
 *
 * Revision 1.84  2005/05/24 12:08:34  sathyan
 * B440: Change: Addedsecured resource for employee Availability
 *
 * Revision 1.83  2005/05/17 04:04:45  subhashini
 * B325:Changed:Changed Input Bid Card
 *
 * Revision 1.82  2005/05/05 16:26:56  georgem
 * Added media code secured resource
 *
 * Revision 1.81  2005/04/28 14:55:58  dans
 * wotc
 *
 * Revision 1.80  2005/04/19 07:40:37  sathyan
 * A250: Added secured resource for Start/reactivate
 *
 * Revision 1.79  2005/04/15 03:10:26  dans
 * added wotc and wotc_import
 *
 * Revision 1.78  2005/03/17 03:07:45  dans
 * merged reporting branch
 *
 * Revision 1.77  2005/02/02 12:15:09  mousumib
 * added secured resource for requirement hierarchy
 *
 * Revision 1.76  2005/02/02 11:51:09  sathyan
 * Added the secured resource for longevity report
 *
 * Revision 1.75  2005/02/02 09:56:34  rajuk
 * Bug 2499- Change Added SecuredResource for Pay Rate Reason
 *
 * Revision 1.74  2005/01/24 11:37:33  sathyan
 * added the entry for program/skill reports
 *
 * Revision 1.73  2005/01/20 11:41:47  sathyan
 * Added the secured resource for Cumulative hour report
 *
 * Revision 1.72  2005/01/12 11:31:32  sathyan
 * Added the entry for Employee Orientation reports
 *
 * Revision 1.71  2005/01/11 11:52:35  subhashini
 * Flex code - Added resources for Bid Card Type and Bid Card Instructions
 *
 * Revision 1.70  2005/01/11 03:51:52  mousumib
 * secured resource for client restrictions added
 *
 * Revision 1.69  2005/01/07 08:12:18  sathyan
 * Added the sedured resource for EMployee profile report
 *
 * Revision 1.68  2004/10/27 12:41:42  mousumib
 * added secured resource SESSION_ROSTER
 *
 * Revision 1.67  2004/10/19 13:27:06  mousumib
 * added TAKE_ACTION
 *
 * Revision 1.66  2004/10/06 04:07:01  mousumib
 * added secured resource SHIFT_NOTES
 *
 * Revision 1.65  2004/09/09 08:37:55  sathyan
 * Added entry for crewdesk
 * rosters
 *
 * Revision 1.64  2004/09/02 05:33:55  mousumib
 * onstant ASSOCIATE_OPEN_ORDERS is added
 *
 * Revision 1.63  2004/09/01 18:16:52  georgem
 * Create helper SQL scripts and syncronized
 * tenor and sodium with security information. Constants file re-created
 *
 * Revision 1.62  2004/08/30 13:44:21  mousumib
 * contant PENDING_WARNING_LETTERS is added
 *
 * Revision 1.61  2004/08/30 05:37:02  sathyan
 * Added entry for current shcedule
 *
 * Revision 1.60  2004/08/26 10:13:47  mousumib
 * secured resource constant WORKFORCE is added
 *
 * Revision 1.59  2004/08/23 13:15:33  mousumib
 * 3 secured resources NO_HOME_ASSIGNMENT, NO_SET_SCHEDULE, UNGENERATED_SCHEDULE have been added
 *
 * Revision 1.58  2004/08/16 07:25:13  shivak
 * *** empty log message ***
 *
 * Revision 1.57  2004/08/16 06:32:51  shivak
 * secured resources are added for pepper and master warning reports.
 *
 * Revision 1.56  2004/08/13 09:48:39  shivak
 * Secured resource for Tickler Aging rpt is added.
 *
 * Revision 1.55  2004/08/11 04:06:43  sathyan
 * Added scurity resource for current Attendance
 *
 * Revision 1.54  2004/08/02 10:40:11  shivak
 * EMPLOEE_MASTER_RPT is renamed as ACTIVE_MASTER_REPORT.
 *
 * Revision 1.53  2004/07/29 06:09:00  sathyan
 * Added the entry for attendance history
 *
 * Revision 1.52  2004/07/21 12:03:05  subhashini
 * Added Schedule_Week secured resource
 *
 * Revision 1.51  2004/07/20 11:49:50  shivak
 * new values added after running new SQL script.
 *
 * Revision 1.49  2004/07/14 05:02:05  sathyan
 * Added an entry for associate schedule setup
 *
 * Revision 1.48  2004/06/11 04:09:12  sathyan
 * Modified the Secured resources for Result hrevent
 *
 * Revision 1.47  2004/06/09 11:20:02  nreddy
 * Added security entries for BgCheck
 *
 * Revision 1.46  2004/06/08 06:20:29  dans
 * added reporting
 *
 * Revision 1.45  2004/06/03 07:39:57  sathyan
 * Added Secured resource for Associte Hr Events and Associte Documents
 *
 * Revision 1.44  2004/06/01 08:47:05  georgem
 * added new secured resource - associate_document
 *
 * Revision 1.43  2004/05/29 08:19:51  georgem
 * Working on new login page; modified lt_tickler_topics structure,
 * verified secured resources
 *
 * Revision 1.42  2004/05/27 05:07:48  georgem
 * Added new finder method to get users for office and role
 *
 * Revision 1.41  2004/05/26 18:03:43  dans
 * submitted changes for security
 *
 * Revision 1.40  2004/05/19 05:50:08  shivak
 * new field SCHEDULE_HR_EVENT is added.
 *
 * Revision 1.39  2004/05/12 04:55:42  nreddy
 * added entry for workhistory-previous employment history
 *
 * Revision 1.38  2004/05/06 16:43:31  georgem
 * Formated code
 *
 * Revision 1.37  2004/05/05 13:40:32  shivak
 * new field "ASSOCIATE_TAG_PAD" is added.
 *
 * Revision 1.36  2004/04/09 12:53:37  bhuvana
 * associateI9 added
 *
 * Revision 1.35  2004/04/05 23:14:10  georgem
 * Added new resources of Pay Rates and Terminations
 *
 * Revision 1.34  2004/04/05 12:08:31  shivak
 * CREW_DESK_EVENT_SCHEDULE  & ASSOCIATE_ADD_EDIT_MAP  R ADDED.
 *
 * Revision 1.33  2004/03/30 11:40:26  nreddy
 * added entry for session W/O result
 *
 * Revision 1.32  2004/03/26 11:43:49  nreddy
 * added new resource for valid assignments
 *
 * Revision 1.31  2004/03/26 08:53:02  bhuvana
 * added w4History
 *
 * Revision 1.30  2004/03/11 09:00:40  sathyan
 * added the entry for Associate Bio
 *
 * Revision 1.29  2004/03/06 10:05:23  nreddy
 * Aded new entry for payroll info
 *
 * Revision 1.28  2004/03/02 04:56:09  nreddy
 * new entry added for training program codes
 *
 * Revision 1.27  2004/02/16 05:33:47  sathyan
 * Added entry for client contacts.
 *
 * Revision 1.26  2004/02/09 04:32:17  sathyan
 * added entries for profile codes and eeo codes.
 *
 * Revision 1.25  2004/02/05 11:06:52  bhuvana
 * NAtional work comp codes has been added
 *
 * Revision 1.24  2004/02/04 12:03:12  nreddy
 * added entry for MasterDeptCodes
 *
 * Revision 1.23  2004/02/02 12:08:05  bhuvana
 * *** empty log message ***
 *
 * Revision 1.22  2004/02/02 12:03:47  bhuvana
 * Occurrence Reason Codes has been added
 *
 * Revision 1.21  2004/02/02 05:06:08  nreddy
 * added entry for MasterShift
 *
 * Revision 1.21 2004/02/02 10:34:33 nreddy
 * added entry for Master Shifts 
 * Revision 1.20  2004/01/28 05:16:19  sathyan
 * added entry for background check reason
 *
 * Revision 1.19  2004/01/21 08:59:55  sathyan
 * Added the entry for nationl tickler codes.
 *
 * Revision 1.18  2004/01/20 06:38:26  nreddy
 * Client shift for national is added- after spell mistake
 *
 * Revision 1.17  2004/01/20 05:56:30  nreddy
 * Client shift for national is added
 *
 * Revision 1.16  2004/01/20 04:46:11  sathyan
 * Drug test reasons added
 *
 * Revision 1.15  2004/01/19 04:07:27  nreddy
 * added  NATIONAL_TERMINATION_CODES into securedresources.java
 *
 * Revision 1.14  2004/01/14 10:16:58  bhuvana
 * A constant for Attendance Codes is added
 *
 * Revision 1.13  2004/01/14 05:32:35  sathyan
 * Added entry for Burden Tables.
 *
 * Revision 1.12  2004/01/05 03:36:06  dans
 * added client
 *
 * Revision 1.11  2004/01/05 02:49:17  dans
 * added public static final Long DAY_WEEK_CONFIGURATION = new Long(40);
 * public static final Long WHITE_BOARD = new Long(41);
 * public static final Long ROSTER_GROUPS = new Long(42);
 *
 * Revision 1.10  2003/12/29 09:55:35  sathyan
 * added the entry for hr documents
 *
 * Revision 1.9  2003/12/26 02:05:09  georgem
 * working on local user maintenance - add/edit view controllers. Also synced up list of secure resources
 *
 * Revision 1.8  2003/12/24 03:55:27  georgem
 * *** empty log message ***
 *
 * Revision 1.7  2003/12/23 04:44:03  nreddy
 * office workorders is added
 *
 * Revision 1.6  2003/12/17 06:42:18  sathyan
 * added entry for Hr_events
 *
 * Revision 1.5  2003/12/16 03:11:50  georgem
 * added missing value - looks like database is out of sync
 *
 * Revision 1.4  2003/12/15 22:01:09  georgem
 * added client dept and shift codes tables
 *
 * Revision 1.3  2003/12/15 05:38:38  dans
 * added office care facilities and office care fac directions
 *
 * Revision 1.2  2003/12/12 22:10:01  dans
 * added ASSOCIATE_WARNING_LETTERS
 *
 * Revision 1.1  2003/12/05 20:30:29  georgem
 * breaking up project into separate modules
 *
 * Revision 1.20  2003/12/05 04:13:24  bhuvana
 * The constant for attendance policy is added
 *
 * Revision 1.19  2003/12/05 03:37:52  nreddy
 * Added roster group  into secured resources
 *
 * Revision 1.18  2003/12/01 23:24:39  dans
 * Added Office Warning Letters and Office Warn Letter Details
 *
 * Revision 1.17  2003/11/27 10:25:39  sathyan
 * added pay rates
 *
 * Revision 1.16  2003/11/21 22:16:13  georgem
 * Oops ... I removed resource 'schedule' by mistake - corrected
 *
 * Revision 1.15  2003/11/21 21:49:21  georgem
 * added SDLP resources into database and updated this file
 *
 *
 */
public interface SecuredResources
{
  public static final Long ACTIVE_AGING_REPORT = new Long(38);
  public static final Long AGENCIES = new Long(14);
  public static final Long ASSOCIATE = new Long(6);
  public static final Long ASSOCIATE_APPLICATION = new Long(78);
  public static final Long ASSOCIATE_BACKGROUND_CHECK = new Long(82);
  public static final Long ASSOCIATE_CURRENT_ATTENDANCE = new Long(88);
  public static final Long ASSOCIATE_CURRENT_SCHEDULE = new Long(96);
  public static final Long ASSOCIATE_CUSTOM_FIELDS = new Long(74);
  public static final Long ASSOCIATE_DAYS_OFF = new Long(84);
  public static final Long ASSOCIATE_DRUG_TEST = new Long(81);
  public static final Long ASSOCIATE_HR_EVENT_RECORDS = new Long(79);
  public static final Long ASSOCIATE_I9S = new Long(70);
  public static final Long ASSOCIATE_MAPS = new Long(64);
  public static final Long ASSOCIATE_OPEN_ORDERS = new Long(98);
  public static final Long ASSOCIATE_PAY_RATES = new Long(68);
  public static final Long ASSOCIATE_PROGRAM_CODES = new Long(59);
  public static final Long ASSOCIATE_SCHEDULE_HR_EVENT = new Long(73);
  public static final Long ASSOCIATE_SCHEDULE_SETUP = new Long(83);
  public static final Long ASSOCIATE_TAG_PAD = new Long(71);
  public static final Long ASSOCIATE_TERMINATIONS = new Long(69);
  public static final Long ASSOCIATE_VALID_ASSIGNMENTS = new Long(65);
  public static final Long ASSOCIATE_W4S = new Long(63);
  public static final Long ASSOCIATE_WARNING_LETTERS = new Long(26);
  public static final Long ASSOCIATE_WORK_HISTORY = new Long(72);
  public static final Long ATTENDANCE_HISTORY = new Long(87);
  public static final Long ATTENDANCE_POLICY = new Long(24);
  public static final Long BID_VIOLATION_REPORTS = new Long(118);
  public static final Long BURDEN_TABLES = new Long(47);
  public static final Long CLIENTS = new Long(44);
  public static final Long CLIENT_CONTACTS = new Long(58);
  public static final Long CLIENT_DEPARTMENT_CODES = new Long(29);
  public static final Long CLIENT_HOURS_REPORTS = new Long(119);
  public static final Long CLIENT_SHIFTS = new Long(30);
  public static final Long CREW_DESK_EVENT_SCHEDULE = new Long(67);
  public static final Long CREWDESK_ROSTERS = new Long(99);
  public static final Long CUMULATIVE_HOURS_REPORT = new Long(105);
  public static final Long DAILY_TICKLER_REPORT = new Long(34);
  public static final Long DAY_WEEK_CONFIGURATION = new Long(40);
  public static final Long DRUG_TEST_REASONS = new Long(48);
  public static final Long DRUG_TEST_SELECTION_REPORT = new Long(117);
  public static final Long EEO_PROFILE_REPORT = new Long(39);
    
  public static final Long EMPLOYEE_MASTER_REPORT = new Long(37);  
  public static final Long EMPLOYEE_PROFILE_REPORT = new Long(104);
  public static final Long EMPLOYEE_OCCURRENCE_REPORT = new Long(116);
  public static final Long EMPLOYEE_ORIENTATION_REPORTS = new Long(110);  
  public static final Long FULL_ASSOCIATE_BIO = new Long(62);
  public static final Long GENERIC_BUSINESS_RESOURCE = new Long(100);
  public static final Long HR_DOCUMENTS = new Long(35);
  public static final Long HR_EVENT_CONFIG = new Long(32);
  public static final Long IMPORT = new Long(125);
  public static final Long IS_CLIENT_VIEWABLE = new Long(154);
  public static final Long LOCAL_MAINTENANCE = new Long(11);
  public static final Long LOCAL_USER = new Long(0);
  public static final Long MAP_CONFIG = new Long(13);
  public static final Long MASTER_WARNING_REPORT = new Long(91);
  public static final Long NATIONAL_ATTENDANCE_CODES = new Long(46);
  public static final Long NATIONAL_CLIENT_SHIFT = new Long(49);
  public static final Long NATIONAL_EEO_CODES = new Long(56);
  public static final Long NATIONAL_MASTER_DEPT_CODE = new Long(53);
  public static final Long NATIONAL_MASTER_SHIFT = new Long(52);
  public static final Long NATIONAL_PROFILE_CODES = new Long(57);
  public static final Long NATIONAL_TERMINATION_CODES = new Long(45);
  public static final Long NATIONAL_TICKLER_CODES = new Long(50);
  public static final Long NATIONAL_USER = new Long(33);
  public static final Long NATIONAL_WORK_COMP_CODES = new Long(55);
  public static final Long NATL_BACKGROUND_CHECK_REASONS = new Long(51);
  public static final Long NATL_OCCURRENCE_REASON_CODES = new Long(54);
  public static final Long NO_HOME_ASSIGNMENT = new Long(93);
  public static final Long NO_SET_SCHEDULE = new Long(94);
  public static final Long OFFICE = new Long(1);
  public static final Long OFFICE_CARE_FACILITIES = new Long(27);
  public static final Long OFFICE_CARE_FAC_DIRECTIONS = new Long(28);
//  public static final Long OFFICE_CONFIG = new Long(12);
  public static final Long OFFICE_PAY_RATES = new Long(21);
  public static final Long OFFICE_UDF = new Long(15);
  public static final Long OFFICE_UDF_VALUES = new Long(16);
  public static final Long OFFICE_WARNING_LETTERS = new Long(22);
  public static final Long OFFICE_WARN_LETTER_DETAILS = new Long(23);
  public static final Long OFFICE_WORK_ORDERS = new Long(31);
  public static final Long PAYROLL_SETUP = new Long(61);
  public static final Long PENDING_AGING_REPORT = new Long(85);
  public static final Long PENDING_WARNING_LETTERS = new Long(97);
  // People Scout client number and people scout job code both are same.
  // TODO: Rename the resoruce, after confirmed by Dan.
  public static final Long PEOPLESCOUT_CLIENT_NUMBER = new Long(10);
  public static final Long PEPPER_REPORT = new Long(90);
  public static final Long PROD_DEPARTMENT = new Long(17);
  public static final Long PROD_LINE = new Long(18);
  public static final Long PROD_PROGRAM = new Long(19);
  public static final Long PROD_SHIFT = new Long(20);
  public static final Long PROGRAMS_SKILL_LEVELS_REPORT = new Long(111);
  public static final Long PROFILE_SUMMARY_REPORTS = new Long(115);
  public static final Long RABBIT_REPORT = new Long(77);
  public static final Long REPORT_WRITER = new Long(75);
  public static final Long RESULT_HR_EVENT = new Long(80);
//  public static final Long ROSTER_GROUPS = new Long(42);
  public static final Long SCHEDULE = new Long(4);
  public static final Long SCHEDULE_REQUIREMENT = new Long(5);
  public static final Long SCHEDULE_ROSTER_GROUPS = new Long(25);
  public static final Long SESSION_ROSTER = new Long(103);
  public static final Long SCHEDULE_WEEK = new Long(86);
  public static final Long SESSIONS_WO_RESULTS = new Long(66);
  public static final Long SHIFT_NOTES = new Long(101);
  public static final Long TERMINATION_CODE = new Long(9);
  public static final Long TERMINATION_REPORT = new Long(43);
  public static final Long TICKLER = new Long(2);
  public static final Long TICKLER_AGING_REPORT = new Long(89);
  public static final Long TAKE_ACTION = new Long(102);
  public static final Long TICKLER_FOLLOWUP = new Long(3);
  public static final Long TICKLER_TOPICS = new Long(7);
  public static final Long TIME_BLOCK = new Long(8);
  public static final Long TURNOVER_TENURE_REPORT = new Long(60);
  public static final Long UNGENERATED_SCHEDULE = new Long(92);
//  public static final Long USER_REPORT = new Long(36);
  public static final Long USER_REPORTS = new Long(76);
  public static final Long WHITE_BOARD_CONFIG = new Long(41);
  public static final Long WORKFORCE = new Long(95);
  public static final Long WOTC = new Long(123);
  public static final Long WOTC_IMPORT = new Long(124);
  
  public static final Long EMPLOYEE_AVAILABILITY_REPORT = new Long(129);
  
  //Following are the constants used for FLEX
  public static final Long CLIENT_RESTRICTIONS = new Long(107);
  public static final Long BID_CARD_TYPES = new Long(108);
  public static final Long BID_CARD_INSTRUCTIONS = new Long(109);
  public static final Long NATIONAL_PAY_RATE_REASONS = new Long(114);
  public static final Long EMPLOYEE_LONGEVITY_REPORT = new Long(113);
  public static final Long PEOPLESCOUT_MEDIA_CODE = new Long(126);  
  public static final Long REQUIREMENT_HIERARCHIES = new Long(112);
  public static final Long START_ASSOCIATE = new Long(120);
  public static final Long REACTIVATE_ASSOCIATE = new Long(121); 
  public static final Long ASSOCIATE_BID_CARDS = new Long(127);
  public static final Long GENERAL_CONFIG = new Long(130);
  public static final Long ASSOCIATE_HIERARCHIES = new Long(131);  
  public static final Long ORIENTATION_ROSTER_REPORT = new Long(132);  
  public static final Long EMPLOYEE_HOURS_REPORT = new Long(133);
  public static final Long OFFICE_IP_ADDRESS = new Long(136);
  public static final Long RESTRICTED_OFFICE_USERS = new Long(135);  
  public static final Long MISSING_BID_AGING_REPORT = new Long(137);
  public static final Long MISSING_BID_EXCEPTION_REPORT = new Long(138);
  public static final Long ROLE_PERMISSIONS = new Long(128);  
  public static final Long BID_CARD_REPORT = new Long(139);  
  public static final Long PRE_SCHEDULE_AUDIT = new Long(140);
  public static final Long ASSOCIATE_SCHEDULES_REPORT = new Long(141);
  public static final Long GANTT_SCHEDULING_REPORT = new Long(142);  
  public static final Long MASTER_SCHEDULES_REPORT = new Long(143);  
  public static final Long ATTENDANCE_DATA_IMPORT = new Long(144);
  public static final Long BAR_CODE_HOURS_REPORT = new Long(145);
  public static final Long PS_IMPORT = new Long(146);
  public static final Long EMAIL = new Long(147);
  public static final Long UNITIME_REPORT = new Long(148);
  public static final Long UNITIME_SCHEDULE_REPORT = new Long(149);
  public static final Long MAILING_LABEL_REPORT = new Long(150);
  public static final Long ALPHA_REPORT = new Long(151);
  public static final Long ID_CARD_REPORT = new Long(152);
  public static final Long SITE_ROSTER_REPORT = new Long(153);
  public static final Long ASSOCIATE_DOCUMENTS = new Long(156);
  public static final Long STAFFTRACK_FILES = new Long(157);
  public static final Long BID_CARD_DELIVERY_TYPES = new Long(158);
  public static final Long PHONE_TYPES = new Long(159);
  public static final Long ZIP_CODES = new Long(160);
  public static final Long STATES = new Long(161);
  public static final Long LANGUAGES = new Long(162);
  public static final Long SCHED_BID_CARD_TIME_BLOCKS = new Long(163);
  public static final Long SCHED_BLOCK_DAYS = new Long(164);
  public static final Long SCHEDULE_CONFIGURATION = new Long(165);
  public static final Long LOCAL_ATTENDANCE_CODES = new Long(166);
  public static final Long CREWDESK_MODULE = new Long(167);
  public static final Long ASSOCIATE_MODULE = new Long(168);
  public static final Long SCHEDULING_MODULE = new Long(169);
  public static final Long REPORTS_MODULE = new Long(170);
  public static final Long SYSTEM_MODULE = new Long(171);
  public static final Long CREWDESK_WHITEBOARD_TAB = new Long(172);
  public static final Long CREWDESK_RECRUITING_TAB = new Long(173);
  public static final Long CREWDESK_ANALYSIS_TAB = new Long(174);
  public static final Long ASSOCIATE_RECRUITING_TAB = new Long(175);
  public static final Long ASSOCIATE_SETUP_TAB = new Long(176);
  public static final Long ASSOCIATE_HISTORY_TAB = new Long(177);
  public static final Long SYSTEM_NATIONAL_MAINTENANC_TAB = new Long(178);
  public static final Long ASSOCIATE_MAIN_TAB = new Long(179);
  public static final Long CREWDESK_MAIN_TAB = new Long(180);
  public static final Long SCHEDULING_MAIN_TAB = new Long(181);
  public static final Long SYSTEM_LOCAL_MAINTENANCE_TAB = new Long(182);
  public static final Long EMPLOYEE_REPORTS_TILE = new Long(183);
  public static final Long STATISTICS_REPORTS_TILE = new Long(184);
  public static final Long SCHEDULING_REPORTS_TILE = new Long(185);
  public static final Long OTHER_REPORTS_TILE = new Long(186);
  public static final Long REPORT_WRITER_RPTS_LIST_TILE = new Long(187);
  public static final Long MANUAL_FILL_REVIEW = new Long(188);
  public static final Long MANUAL_SCHEDULING =  new Long(189);
  public static final Long IQN_IMPORT =  new Long(190);
  public static final Long SCHEDULE_REVIEW_SCHEDULES =  new Long(191);
  public static final Long SCHEDULE_ASSOCIATE_ISSUES =  new Long(192);
  public static final Long AGENCY_CONVERSION =  new Long(193);
  public static final Long SEARCH_ASSOCIATE =  new Long(194);
  public static final Long ARCHIVED_ASSOCIATE_DOCUMENTS = new Long(195);
  public static final Long REQUIREMENT_PROOF_REPORT  = new Long(196);

  public static final Long OFFICE_TRANSFER_MAP_UDF = new Long(197);
  public static final Long OFFICE_TRANSFER_MAP_HR_DOC = new Long(198);
  public static final Long TRANSFER_ASSOCIATE = new Long(199);

  public static final Long NATIONAL_MAINTENANCE_SETUP = new Long(200);
  public static final Long NATIONAL_MAINTENANCE_MAIN_TABLES = new Long(201);
  public static final Long NATIONAL_MAINTENANCE_OTHER_TABLES = new Long(202);
  public static final Long NATIONAL_MAINTENANCE_IMPORT = new Long(203);
  public static final Long SSN_SECURITY_AUDIT_REPORT  = new Long(204);

  public static final Long VIEW_COMPLETE_SSN  = new Long(205);
  public static final Long AUDIT_REPORTS =  new Long(206);
  
  public static final Long LOCAL_SCHED_CONFIG_TILE = new Long(155);
  public static final Long LOCAL_CONFIG_TILE = new Long(207);
  public static final Long LOCAL_VALIDATION_TBL_TILE = new Long(208);
  public static final Long LOCAL_CUSTIOMIZATIONS_TILE = new Long(209);
  public static final Long LOCAL_RECRUITING_TILE = new Long(210);
  public static final Long LOCAL_IMPORT_TILE = new Long(211);
  public static final Long SYSTEM_USERS_AUDIT_REPORT = new Long(212);  
  public static final Long USER_ACTIVITY_REPORT = new Long(213);
  
  public static final Long ELIGIBLE_TO_WORK_AUDIT_REPORT = new Long(214);
  public static final Long RESET_PASSWORD = new Long(12);
  public static final Long ASSOCIATE_I9_VERIFICATION = new Long(36);
  public static final Long I9_ARCHIVED_VERIFICATIONS_TILE = new Long(42);
  public static final Long I9_VERIFICATION_DOCUMENTS_TILE = new Long(106);
  public static final Long ARCHIVED_ASSOCIATE_I9 = new Long(122);
  public static final Long MULTI_OFFICE_REPORT_WRITER = new Long(215);  
  public static final Long SCHEDULED_MULTI_OFFICE_EVERIFY_REPORT = new Long(216);
  public static final Long NCD_MODULE = new Long(217);
  public static final Long NCD_MAIN_REPORTS_TILES = new Long(218);
  
  public static final Long STAFF_MANAGEMENT_NEWS = new Long(219);
  
  public static final Long HISTORICAL_HOURS_CONFIGURATION = new Long(220);
  public static final Long PAYROLL_INVOICE_GROUPS = new Long(221);
  public static final Long PAYROLL_WO_CLIENT_REFERENCES = new Long(222);
  
  public static final Long UPLOAD_WO_CLIENT_REFERENCES = new Long(223);
  public static final Long EXPORT_WO_CLIENT_REFERENCES = new Long(224);
  
  public static final Long PAYROLL_WORKORDER_SCHEME = new Long(225);
  
  //public static final Long PAYROLL_WORK_ORDERS = new Long(226);
  public static final Long REJECT_WORK_ORDERS_LINK = new Long(226);
  
  public static final Long OFFICE_PAYROLL_MARKUPS = new Long(227);
  
  public static final Long PAYROLL_WORK_ORDER_GROUP = new Long(228);
  
  public static final Long ASSOCIATE_PAYROLL_ADDWORKORDER = new Long(229);
  
  public static final Long ASSOCIATE_WEEK_PAYROLL_RECORDS = new Long(230);
  
  public static final Long EDIT_WO_AND_HOUR = new Long(231);
  
  public static final Long ASSOC_CURRENT_WK_PAYROLL_RECS = new Long(232);
  
  public static final Long ASSOC_LAST_WK_PAYROLL_RECS = new Long(233);
  
  public static final Long ASSOC_HISTORY_WK_PAYROLL_RECS = new Long(234);
  
  public static final Long ASSOC_PAYROLL_CURRENT_SETUP = new Long(235);
  
  public static final Long ADD_EDIT_BONUS_HOURS = new Long(236);
  
  public static final Long VIEW_BONUS_HOURS_HISTORY = new Long(237);
  
  public static final Long ASSOCIATE_PAYROLL_WEEKLY_HOURS_HISTORY = new Long(238);
  
  public static final Long PAYROLL_TAKE_ACTION = new Long(239);
  public static final Long UPLOAD_WOS_TO_TEMPWORKS = new Long(240);
  
  public static final Long WORKORDER_NO_LISTINGS_REPORT = new Long(241);
  
  public static final Long ASSOC_PAYROLL_WO_AUDIT_REPORT = new Long(242);
  public static final Long PAYROLL_WORKORDER_REPORT = new Long(243);
  
  public static final Long MANUAL_WORK_ORDER_REVIEW = new Long(244);
 
  public static final Long ASSOCIATE_PAYROLL_HISTORY = new Long(245);
  public static final Long ASSOCIATE_PREVIOUS_HOURS = new Long(246);
  
  public static final Long TRANSMIT_WORK_ORDER_HISTORY = new Long(247);
  
  public static final Long TRANSMIT_WORK_ORDER = new Long(248);
  
  public static final Long TRANSMIT_WORK_ORDER_GENERATE = new Long(249);
  
  public static final Long TRANSMIT_PAYROLL = new Long(250);
  
  public static final Long TRANSMIT_PAYROLL_HISTORY = new Long(251);
  
  public static final Long OFFICE_TRANSFER_MAP_UDF_VALS = new Long(252);
  
  public static final Long SCHEDULED_PAYROLL_REPORT = new Long(253);
  
  public static final Long PERMISSIONS_FOR_ENTER_TIME = new Long(254);
  
  public static final Long PAYROLL_GEN_CONFIGURATION = new Long(255);
  
  public static final Long LOCAL_PAYROLL_TILE = new Long(256);
  
  public static final Long PAYROLL_MAIN_TAB = new Long(257);
  
  public static final Long OFFICE_TRANS_OFFICES = new Long(258);
  
  public static final Long HRS_MISMATCH_APPROVAL_HISTORY = new Long(259);

  public static final Long PAYROLL_IMPORT_RECORD_REPORT = new Long(260);
  
  public static final Long OFFICE_ATTENDANCE_IMPORT = new Long(261);
  
  public static final Long OFFICE_HOURS_IMPORT_FORMAT = new Long(262);
  
  public static final Long OFFICE_WO_CLIENT_REF_MAPPING = new Long(263);
  
  public static final Long REPORTS_OFFICE_REPORTS_TAB = new Long(264);
  
  public static final Long REPORTS_OFFIC_REPORTWRITER_TAB = new Long(265);
  
  public static final Long REPORTS_NATNL_REPORTWRITER_TAB = new Long(266);
  
  public static final Long WORK_ORDER_TAGPAD = new Long(267);
  
  public static final Long LOCAL_EVERIFY_TILE = new Long(268);
  
  public static final Long WO_REQ_ASSOCIATION = new Long(269);
  
  public static final Long UPLOAD_WOS_TO_STN = new Long(270);
  
  public static final Long BIO_PRINTOUT_REPORT = new Long(271);
  
  public static final Long SCHED_REQUIREMENTS_IMPORT =  new Long(272);
  
  public static final Long BOGUS_SSN_CREATION =  new Long(273);
  
  public static final Long OFFICE_CREDITS =  new Long(274);
  
  public static final Long ASSOC_OFFICE_DEDUCT_BILLINGS = new Long(275);
  
  public static final Long ASSOC_DEDUCT_BILLINGS = new Long(276);
  
  public static final Long SCHED_WEEK_PAYROLL_BILLINGS = new Long(277);
  
  public static final Long CONVERT_ASSOCIATE = new Long(278);
  
  public static final Long DOC_MERGE_SSN_CHG_REPORT = new Long(279);
  
  public static final Long HR_DOCUMENT_TYPE = new Long(280);
  
  public static final Long OFFICE_BG_CHECK_CONFIG = new Long(281);
  
//START: eVerifyV17 - Link resources
  public static final Long SSA_REFERRAL_LETTER = new Long(282);
  
  public static final Long SSA_CONTEST = new Long(283);
  
  public static final Long SSA_RESUBMIT = new Long(284);
  
  public static final Long DHS_REFERRAL_LETTER = new Long(285);
  
  public static final Long DHS_CONTEST = new Long(286);
  
  public static final Long I9_CASE_CLOSURE = new Long(287);
  
  public static final Long I9_ADDITIONAL_VERIFICATION = new Long(288);

  public static final Long I9_CASE_DETAILS_FROM_EVERIFY = new Long(289);
  
  public static final Long OFFICE_BG_CHECK_TYPES = new Long(290);
  public static final Long WO_AUDIT_FAILURE = new Long(291);
  public static final Long NATIONAL_AUDIT_FAILURES = new Long(292);
  public static final Long BG_CHK_FAILURE_CODE = new Long(293);
  public static final Long I9_EVERIFY_V17_CASE_DETAILS = new Long(294);
  public static final Long OFFICE_BG_CHK_PACKAGES = new Long(295);
  public static final Long ASSOC_I9_DETAILS_EDIT_PAGE = new Long(296);
  public static final Long SSA_NON_CONTEST = new Long(297);
  public static final Long DHS_NON_CONTEST = new Long(298);
  public static final Long I9_SECONDARY_REVIEW_DATE = new Long(299);
  
  public static final Long TRANSMIT_PAYROLL_WEEKS = new Long(300);
  
  public static final Long TRANSMIT_WOS_TO_TEMPWORKS = new Long(301);
  
  public static final Long PAYROLL_WEEK_TRANSMIT_WO = new Long(302);
  
  public static final Long WEEKLY_WO_AUDIT_REPORT = new Long(303);
  // End: eVerifyV17 - Link resources  
  
  public static final Long WEEKLY_WO_AUDIT = new Long(304);  
  
  public static final Long ASSOCIATE_BG_TRACKING = new Long(305);
  public static final Long ASSOCIATE_BG_TRACK_HISTORIES = new Long(306);
  public static final Long EVERIFY_TAKE_ACTION_DETAIL = new Long(307);

  public static final Long LOCK_ASSOCIATE_HOURS = new Long(308);
  
  public static final Long REOPEN_TRANSMIT_WEEK = new Long(309);
  
  public static final Long TRANSMIT_WEEK_ISLIVE_ACTION = new Long(310);
  
  public static final Long BG_CHECK_INTG_RESULT = new Long(311);
  
  public static final Long MYSTN_INTERNAL = new Long(312);
  
  public static final Long MYSTN_CLIENT = new Long(313);

  // MYSTN TABS RESOURCES - All these must have a mapping in 
  public static final Long MYSTN_REPORTS_TAB = new Long(314);
  public static final Long MYSTN_INVOICE_TAB = new Long(315);
  public static final Long MYSTN_ORDERS_TAB = new Long(316);
  public static final Long MYSTN_AUDIT_TAB = new Long(317);
  
  public static final Long MYSTN_ORDER_CONFIG = new Long(318);
  
  public static final Long MYSTN_OFFICE_LINKS = new Long(319);
  
  public static final Long MYSTN_CLIENTS_LINKS = new Long(320);
  
  public static final Long ASSOCIATE_SPL_BG_TRACKING = new Long(321);
  
  public static final Long MYSTN_OFFICE_FILES = new Long(322);
  
  public static final Long MYSTN_CLIENTS_FILES = new Long(323);
  
  public static final Long ORDERS_REPORT = new Long(324);
  
  public static final Long ORDER_TO_INV_HOURS_REPORT = new Long(325);
  
  public static final Long MYSTN_ORDER_CHANGE_REASON = new Long(326);
  
  public static final Long BG_CHECK_PACKAGE_ACTIVATION = new Long(327);
  
  public static final Long OFFICE_WO_CLI_REF_SDLP_MAPPING = new Long(328);
  
  public static final Long OFFICE_MYSTN_PERF_MANGS_CONFIG = new Long(329);
  
  public static final Long CLIENT_ASSOC_ACT_REQ_REPORT = new Long(330);
  
  
  public static final Long SSA_V20_REFERRAL_LETTER = new Long(331);
  
  public static final Long DHS_V20_REFERRAL_LETTER = new Long(332);
  
  public static final Long SSA_REVERIFY = new Long(333);
  
  public static final Long DHS_REVERIFY = new Long(334);
  
  public static final Long NATIONAL_MAIN_VENDOR = new Long(335);
  
  public static final Long VIEW_ASSOC_CONVERSION_HISTROY = new Long(336);
  
  public static final Long PAYROLL_NOTES = new Long(337);
  
  public static final Long PAYROLL_IMPORT_RECORDS = new Long(338);
  
  public static final Long MYSTN_PREF_DASH_VIEW = new Long(339);
  
  public static final Long EVERIFY_V20_PHOTO_CONFIRM = new Long(340);
  
  public static final Long EVERIFY_V20_PHOTO_NOT_CONFIRM = new Long(341);
  
  public static final Long HOURS_IMPORT_CONFIG = new Long(342);

  public static final Long UNDISTRIBUTED_ORDERS = new Long(343);
  
  public static final Long CREWDESK_ORD_STARTSESSIONS_TAB = new Long(344);
  
  public static final Long VENDOR_DASHBOARD = new Long(345);
  
  public static final Long OFFICE_CAMRID_IMPORT_CONFIG = new Long(346);
  
  public static final Long OFFICE_CAMRID_IMPORT = new Long(348);
  
  public static final Long ORDERS_AND_START_SESSION = new Long(347);

  public static final Long AMZ_WHITE_BOARD_REPORT = new Long(349);
  
  public static final Long AMZ_ROSTER_REPORT = new Long(350);
  
  public static final Long AMAZON_CAAR_IMP_SUBTPC_MAPPING = new Long(351);
  
  public static final Long AMAZON_CAAR_IMP_FILE = new Long(352);
  
  public static final Long VENDOR_ATTACH_RESOURCE = new Long(353);
  
  public static final Long VIEW_FULL_SSN_FOR_REPORTS = new Long(354);
  
  public static final Long PRO_JOB_CODES = new Long(355);
  
  public static final Long PRO_CONFIG_APP_MESSAGE = new Long(356);
  
  public static final Long PRO_NATIONAL_TEMPLATES_CONFIG = new Long(357);
  public static final Long PRO_CLIENT_TEMPLATES_CONFIG = new Long(358);
  public static final Long PRO_OFFICE_TEMPLATES_CONFIG = new Long(359);
  
  public static final Long PRO_AUDIT_SESSIONS = new Long(360);
  
  public static final Long ASSOCIATE_DOCUMENTS_TAB = new Long(361);
  
  public static final Long CREW_DESK_APPLICANTS = new Long(362);
  
  public static final Long STN_EDIT_PRO_DRUGTEST = new Long(363);
  
  public static final Long PRO_UPLOAD_PDF = new Long(364);
  
  public static final Long PRO_DOWNLOAD_PDF = new Long(365);
  
  public static final Long CREWDESK_RISK_TAB = new Long(366);
  
  public static final Long CREWDESK_TAKEACTION_TAB = new Long(367);
  
  public static final Long MISSING_DOCS_TAKE_ACTION = new Long(368);
  
  public static final Long SITE_SPECIFIC_REPORT  = new Long(369);
  
  public static final Long RUN_SCHEDULED_REPORT_WRITER  = new Long(370);
  
  public static final Long MISSING_PUNCH_DATA_REPORT  = new Long(371);
  
  public static final Long PRO_DH_LIVE_CHAT  = new Long(372);
  
  public static final Long OFFICE_CLNT_TIME_SDLP_APPRVL  = new Long(373);
  
  public static final Long OFFICE_CLNT_TIME_APPRVL_CORRSP  = new Long(374);
  
  public static final Long ASSOCIATE_TIME_REPORT = new Long(375);
  
  public static final Long CREW_DESK_PRO_OFFLINE = new Long(376);
  
  public static final Long GLOBAL_CASH_CARD_NO = new Long(377);
  
  public static final Long SSN_VISIBLILITY = new Long(378);
  
  public static final Long RECRUITING_REPORT = new Long(379);
  
  public static final Long CONFIGURE_IP_FOR_OFFICES = new Long(380);
  
  public static final Long SCHEDULED_RECRUITING_REPORT = new Long(381);
  
  public static final Long PAYROLL_TRANSMIT_REPORT = new Long(382);
  
  public static final Long LT_I9_VERIFICATION_TYPE = new Long(383);
  
  public static final Long LT_I9_VERIFICATION_RESULT = new Long(384);
  
  public static final Long DATATRACK_MODULE = new Long(385);
  
  public static final Long ASSOCIATE_PRODUCTIVITY_TAB = new Long(386);
  
  public static final Long PRODUCTIVITY_IMPORT_CONF = new Long(387);
  
  public static final Long ASSOCIATE_PRODUCTIVITY = new Long(388);
  
  public static final Long HSN_PRODUCTIVITY_REPORT = new Long(389);
  
  public static final Long PREVIOUSLY_DISTRIBUTED_ORDERS = new Long(390);
  
  public static final Long ASSOCIATE_SCHEDULES_TAGGING= new Long(391);
  
  public static final Long I9_1ST_REVIEW = new Long(392);
  
  public static final Long I9_2ND_REVIEW = new Long(393);
  
  public static final Long WAF_RECRUITER_REVIEW = new Long(394);
  
  public static final Long LOCAL_TAX_CODE = new Long(395);
  
  public static final Long ASSOC_INFO_DISCREPANCY_REPORT = new Long(396);
  
  public static final Long ASSOC_DISCREPANCY_INFO = new Long(398);
  
  public static final Long PREVIOUS_CONVICTION_REPORT= new Long(397);
  
  public static final Long ASSOC_REHIRE_STATUS = new Long(399);
  
  public static final Long CREWDESK_WORKFORCE_TAB = new Long(400);  
  
  public static final Long WORK_FORCE_DATA = new Long(401);
  public static final Long NCD_WORKFORCE_DATA = new Long(402);
  public static final Long PAYROLL_WORK_FORCE_DATA = new Long(403);
  
  public static final Long ASSOCIATE_PHOTO_REPORT = new Long(404);
  
  public static final Long NCD_WORKFORCE_APPLICANTS = new Long(405);
  
  public static final Long ASSOCIATE_PHOTO = new Long(406);
  
  public static final Long OFFICE_MID_WEEK_TRANSMIT = new Long(410);
 
  public static final Long OFFICE_PAYROLL_NEW_PAY_TYPE = new Long(412);

  public static final Long OFFICE_MASS_SCHEDULING = new Long(411);
  
  public static final Long DRUG_TEST_REVIEW = new Long(407);
  
  public static final Long DRUG_TEST_IMPORTS = new Long(408);
  
  public static final Long ASSOC_DUPLICATE_INFO = new Long(409);
  
  public static final Long OFFICE_TEST_CONFIGS = new Long(413);
  public static final Long OFFICE_TEST_RESULTS = new Long(414);
  
  public static final Long ASSOCIATE_START_FROM_P_RD = new Long(415);
  
  public static final Long SPLIT_AND_SAVE = new Long(416);
  
  public static final Long UN_ARCHIVE_DOCUMENT = new Long(417);
  
  public static final Long MANUAL_RUN_JOBS = new Long(418);
  
  public static final Long LOCAL_EXTERNAL_JOBS_TILE = new Long(419);
  
  public static final Long OFFICE_JOB_TITLES = new Long(420);
  
  public static final Long ORDER_ASSIGNMNT_IMPORT = new Long(421);

  public static final Long CLIENT_ORDERS = new Long(422);
  
  public static final Long FG_JSID_TIMESHEET_REPORTS = new Long(423); // UC - Fieldglass - download Reports and Bug # SMSTN-10856 
  
  public static final Long DELETE_ASSOC_WARNING_LETTER = new Long(424);
  
  public static final Long ASSOCIATE_TEXTING_PERMISSION = new Long(425); // Bug # 10331
  
  public static final Long PAYROLL_FILE_LINK = new Long(426); 
  
  public static final Long VIEW_RI_HISTORIES = new Long(427);
  
  public static final Long REGENERATE_REVERSE_INVOICE = new Long(428);
  
  public static final Long OFFICE_EVERIFY_CONFIGS = new Long(429);//Manual Data Uploads � Office Everify Configs
 
  public static final Long INACTIVATE_INV_GRP_SDLP = new Long(430);
  
  public static final Long GENERATE_CUMULATIVE_HOURS = new Long(431);
  
  public static final Long PRO_JOB_CODES_APPROVAL = new Long(432);
  
  public static final Long ASSOC_DOC_DATES_EDIT = new Long(433); // Manually Changed Tables - Associate Document Date edit
  
  public static final Long WOTC_ENABLE_ADP_FIELDS = new Long(434);
  
  public static final Long WOTC_TRANSMIT = new Long(435);
  
  public static final Long AUTO_TERMINATION = new Long(436);
  
  public static final Long TRANSMIT_PAYROLL_TO_TW = new Long(437);
  public static final Long TRANSFER_ASSOC_TO_TW = new Long(438);
  public static final Long TRANSFER_OFFICE_TO_TW = new Long(439);
  public static final Long TRANSFER_ALL_TO_TW = new Long(440);
  
  public static final Long TOTAL_ACCRUED_HOURS_ADD_EDIT = new Long(441);
  
  public static final Long JOB_FIT_SURVEY_CONFIGURATION = new Long(442);//UC - Pro Mobile
  public static final Long SOX_DATA_UPLOADS = new Long(443);//UC - SOX Compliance � Manual Uploads
  
  public static final Long FG_BILL_RATE_AUDIT_REPORTS = new Long(444);//UC-Field Glass phase II
  
  public static final Long ADD_MISSING_HR_DOCUMENTS = new Long(445);//SOX - Add Missing Hr Documents(Bug # : 11397)
  
  public static final Long FG_REVENUE_VERIFICATION_REPORT = new Long(446);//UC-Field Glass phase II
  
  public static final Long NATIONAL_TICKLER_UPLOADS = new Long(447);//UC-National Tickler Uploads
  //UC :  TCPA
  public static final Long OPT_IN_SMS_PERMISSION = new Long(448);
  public static final Long OPT_OUT_SMS_PERMISSION = new Long(449);
  public static final Long OPT_IN_SMS_OFFERS = new Long(450);
  public static final Long OPT_OUT_SMS_OFFERS = new Long(451);
  
  //for national report writer changes 2016
  public static final Long RUN_APPROVED_REPORTS_BYUSER = new Long(452);
  
  public static final Long UNDO_TERMINATION = new Long(453);
  
  //SMSTN-11975 : Opt Out of XML Feed for Non Advertising Sites
  public static final Long PRO_JOB_CODE_AUDIT_REPORT = new Long(460);
  public static final Long JOBCODE_STATUS_VS_AUDIT_REPORT = new Long(461);
  
  public static final Long WOTC_ADDITIONAL_DOCS = new Long(462);
  
  public static final Long MANUAL_UPDATE_WOTC_DOCUMENT = new Long(463);
  
  public static final Long SKILLS_TEST_AUDIT_REPORT = new Long(464) ;
  
  public static final Long ACCESS_COMPLETE_WOTC_DOC = new Long(465);
  
  public static final Long MEDIA_COST_RECRUITING_REPORT = new Long(466); //SMSTN-12231 : National Media Cost and Tracking
  
  public static final Long OFFICE_MEDIA_COST = new Long(467);
  
  public static final Long NATIONAL_MEDIA_COST = new Long(468);
  
  public static final Long PRO_PORTAL_USER_ID_UPDATE = new Long(469);
  public static final Long NATIONAL_MEDIA_COST_UPLOADS = new Long(470);//SMSTN-12552 : Media Cost Phase 2 
  
  public static final Long ASSOC_COMM_HISTORIES = new Long(471); //SMSTN-12551-Auto Communication
  
  public static final Long MANUAL_BG_CHECK_PROCESSING = new Long(472); //background new logic additions usecase
  
  public static final Long  ANALYTICS_MODULE = new Long(473); //SMSTN-12550 : Analytics Tab and Office Scorecard
  public static final Long  OFFICE_AUDIT_TAB = new Long(474); 
  public static final Long  CAE_REPORTING_TAB = new Long(475); 
  public static final Long  NCD_TAB = new Long(476); 
  public static final Long  MYSTN_HOURS_APPROVAL_CONFIG = 477L;
  
  public static final Long  BG_DIRECTOR_REVIEW  = 478L;
  
  public static final Long  I9_IDENTIFICATION_COPY  = 479L;
  
  //mystn hours approval report : 13146
  public static final Long  OFFICE_HOURS_APPRL_REPORT  = 480L;
  public static final Long  NATL_HOURS_APPRL_REPORT  = 481L;
  public static final Long  NATIONAL_REPORT  = 482L;
  public static final Long  EDIT_PRO_USER_EMAIL  = 483L;
  
  //13215 : usecase vms fee
  public static final Long  ENABLE_VMS_FEE_CONFIG  = 484L;
  
 //13261 : Drugtest consent usecase
  public static final Long  DRUG_TEST_VENDOR  = 485L;
  public static final Long  DRUG_TEST_PACKAGE  = 486L;
  
  //UC VMS Fee - 13286
  public static final Long  VMS_FEE  = 487L;
  
 //13357 : Texting usecase
 // public static final Long  TEXTING  = 488L;

  public static final Long PRO_PS_JOB_CODE = 489L ;
  
  //SMSTN-13261
  public static final Long CONFIG_OFFICE_DT_PACKAGE = 490L ;
  public static final Long DRUG_TEST_NCD_LAB_RESULTS = 491L ;
  
  //SMSTN : 13566
  public static final Long  CORPORATE_PAYROLL_REPORTS_TILE  = 492L;
  public static final Long  PAYMENT_FORM_EXPORT  = 493L;
  
  //SMSTN-14011
  public static final Long  PAYROLL_TA_PENDING_APPROVAL  = 495L;
  
  //SMSTN-13576
  public static final Long  NATL_MAINT_IT_STAFF_TILE  = 496L;
  
  //SMSTN-13757: Add branding to ST/PRO
  public static final Long  BRAND_MAINTENANCE  = 494L;
  
  public static final Long  NATL_MAINT_FEDERAL_HOLIDAYS  = 497L;
  public static final Long  EMPLOYEE_PAID_HOLIDAY_REPORT  = 498L;//SMSTN-14036 : SIMOS: Paid Holiday
  
  //14036 :paid holidays
  public static final Long  OFFICE_HOLIDAY_CONFIG  = 499L;
  
  //assocaite payrates
  public static final Long  TA_PENDING_ASSOC_PAY_APPRVL  = 500L;
  
  public static final Long  DEDUCTIONS_UPLOAD  = 501L;
  public static final Long  BONUS_UPLOAD  = 502L;
  
  public static final Long  MANAGEMENT_REPORT  = 503L; //SMSTN-14118 - Management Report 
  
  //14224 : quality tracking
  public static final Long  QUALITY_TRACKING_UPLOAD  = 504L;
  public static final Long  QUALITY_TRACKING_CONFIG  = 505L;
  

  //13647 :attendance incentive configuration
   public static final Long  ATTENDANCE_INCENTIVE_CONFIG  = 506L;
   
   //SMSTN-14331 : SIMOS: Attendance Bonus Eligibility Report
   public static final Long  ATTEND_BON_ELIGIBILITY_REPORT  = 507L;
  
}





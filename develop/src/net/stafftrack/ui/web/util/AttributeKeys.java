/*
 * Created on Aug 25, 2003
 *
 */
package net.stafftrack.ui.web.util;


/**
 * A list of stafftrack.net keys for attributes stored in the HttpSession, Request, or ApplicationContext
 * 
 * @author Dan Scovill
 * 
 * @version $Revision: 1.89 $
 * 
 * $Log: AttributeKeys.java,v $
 * Revision 1.89  2018/03/09 04:34:52  venij
 * SMSTN-13535 - associate payroll : office task role access
 *
 * Revision 1.88  2018/02/02 00:44:12  cbclark
 * SMSTN-13500 : Add breadcrumb processing.
 *
 * Revision 1.87  2017/10/31 09:31:30  nagaraj
 * SMSTN:13261
 *
 * Revision 1.86  2017/10/27 03:17:06  nagaraj
 * SMSTN:13261
 *
 * Revision 1.85  2017/08/31 03:41:45  anthony
 * SMSTN-13109 : I9 compliance update
 *
 * Revision 1.84  2017/06/07 05:05:31  nagaraj
 * SMSTN:12502
 *
 * Revision 1.83  2017/02/03 07:29:00  nagaraj
 * SMSTN:12012
 *
 * Revision 1.82  2017/01/04 15:17:28  anthony
 * SMSTN-12012 : WOTC integration with ADP - Additional Forms
 *
 * Revision 1.81  2016/12/22 04:47:00  anthony
 * SMSTN-12012 : WOTC integration with ADP - Additional Forms
 *
 * Revision 1.80  2016/12/15 20:38:31  cbclark
 * SMSTN-12133 : Skills Test Failure Take Actions
 *
 * Revision 1.79  2016/12/05 08:04:52  anthony
 * SMSTN-12012 : WOTC integration with ADP - Additional Forms
 *
 * Revision 1.78  2016/11/22 03:37:33  anthony
 * SMSTN-12012 : WOTC integration with ADP - Additional Forms
 *
 * Revision 1.77  2016/03/14 09:51:01  anthony
 * UC-Field Glass phase II
 *
 * Revision 1.76  2016/02/18 03:25:18  anthony
 * UC-Field Glass phase II
 *
 * Revision 1.75  2015/08/25 07:22:39  nagaraj
 * Tempworks Upgrade : Payroll Changes (Progress Page)
 *
 * Revision 1.74  2015/05/25 06:56:28  nagaraj
 * adp wotc integration usecase
 *
 * Revision 1.73  2015/05/13 04:04:39  nagaraj
 * tempworks usecase
 *
 * Revision 1.72  2015/05/12 06:47:14  anthony
 * Temp works UC
 *
 * Revision 1.71  2015/04/14 03:15:57  venij
 * UC - Order Forecast - updated code
 *
 * Revision 1.70  2015/04/05 17:18:08  venij
 * UC - Order Forecast - updated code
 *
 * Revision 1.69  2015/03/25 10:46:05  venij
 * UC - Payroll Regenerate Invoice - code changes
 *
 * Revision 1.68  2015/03/25 10:06:54  anthony
 * UC - PRO Enhancements 2015 - Work Locations
 *
 * Revision 1.67  2015/03/23 04:34:57  anthony
 * UC - PRO Enhancements 2015 - Recruiting Centers
 *
 * Revision 1.66  2015/03/20 06:34:55  anthony
 * UC - PRO Enhancements 2015 - Office-Wide Job Details
 *
 * Revision 1.65  2015/02/28 18:17:52  anthony
 * UI - System Settings
 *
 * Revision 1.64  2015/02/04 07:08:02  venij
 * UC - Field Glass Integration - updated code
 *
 * Revision 1.63  2015/02/02 08:32:38  nagaraj
 * field glass integration usecase
 *
 * Revision 1.62  2014/12/18 14:37:24  anthony
 * Bug Fix : 10705
 *
 * Revision 1.61  2014/11/06 22:27:07  anthony
 * Cache Maintenance
 *
 * Revision 1.60  2014/10/10 13:50:49  eaustin1
 * For enhancement - SMSTN-10600
 *
 * Create New LM Link for Pan Test Result
 *
 * Revision 1.59  2014/09/25 11:40:18  venij
 * PRD START Associate - use case
 *
 * Revision 1.58  2014/06/10 04:29:46  anthony
 * UC-New PayTypes - Payroll New Pay Types UI Changes - Save Link Enable/Disable
 *
 * Revision 1.57  2014/06/09 09:39:47  anthony
 * UC-New PayTypes - Payroll New Pay Types UI Changes
 *
 * Revision 1.55  2014/05/07 06:31:54  anthony
 * UC - Shift Code Expansion  to STN-LM Changes -Enable or Disable Expanded shift code to offices with validation and Office add/edit changes
 *
 * Revision 1.54  2014/05/05 06:37:04  venij
 * UC-Payroll V14- Merged to HEAD from V14
 *
 * Revision 1.53  2014/04/15 03:24:23  venij
 * UC-Rosetta Validations - web layer code
 *
 * Revision 1.52  2014/03/03 11:31:20  venij
 * UC-Workforce-added the refresh rate and run rate
 *
 * Revision 1.51  2014/02/28 11:14:58  venij
 * UC-Workforce-workforce management subtab
 *
 * Revision 1.50  2014/02/13 05:44:12  venij
 * UC-Workforce-workforce management subtab
 *
 * Revision 1.49  2014/02/12 10:40:26  nagaraj
 * UC-Workforce-crewdesk
 *
 * Revision 1.48  2014/01/31 10:04:34  nagaraj
 * UC-Workforce-NCD
 *
 * Revision 1.47  2014/01/31 05:19:18  nagaraj
 * UC-Workforce-NCD
 *
 * Revision 1.46  2014/01/07 03:58:57  venij
 * UC Tagpad additions-wo attributes
 *
 * Revision 1.45  2013/12/18 11:21:32  venij
 * Rehireable Status Update UC - associate termination history changes
 *
 * Revision 1.44  2013/10/21 06:01:16  nagaraj
 * Recruiting Centers usecase
 *
 * Revision 1.43  2013/05/08 11:59:10  venij
 * PA PSD Form Automation - use case
 *
 * Revision 1.42  2013/04/17 10:15:43  nagaraj
 * aar group editing : in progress
 *
 * Revision 1.41  2013/02/26 09:07:50  venij
 * VMS Redistribute Orders use case
 *
 * Revision 1.40  2013/02/07 11:31:38  venij
 * VMS Redistribute Orders use case
 *
 * Revision 1.39  2013/01/11 12:19:12  venij
 * HSN Productivity use case - productivity report
 *
 * Revision 1.38  2013/01/02 07:13:34  venij
 * HSN Productivity use case - productivity tile
 *
 * Revision 1.37  2012/12/28 10:16:00  sathyan
 * Added code for the import of Performance Score
 *
 * Revision 1.36  2012/11/16 08:38:06  venij
 * Bug 9321 - fixed
 *
 * Revision 1.35  2012/11/15 04:35:11  venij
 * Bug 9318 - fixed
 *
 * Revision 1.34  2012/11/07 12:11:40  venij
 * Bug 9296 - fixed
 *
 * Revision 1.33  2012/11/07 04:56:47  venij
 * Recruiting Report - web layer
 *
 * Revision 1.32  2012/09/10 07:04:40  venij
 * PRO Offline - Resolve Errors
 *
 * Revision 1.31  2012/07/13 06:49:17  venij
 * PRO Offline - Most Recent STN Imports task
 *
 * Revision 1.30  2011/10/18 18:00:38  venij
 * 8360 : Fixed.
 *
 * Revision 1.29  2011/09/28 06:17:29  venij
 * 8543 : fixed
 *
 * Revision 1.28  2011/07/11 08:07:12  venij
 * 8464 : Fixed.
 *
 * Revision 1.27  2011/06/16 11:09:07  venij
 * PRO : Associate History - job details for an associate.
 *
 * Revision 1.26  2011/06/01 12:39:08  venij
 * 8197 : included pagination.
 *
 * Revision 1.25  2011/05/19 20:19:05  venij
 * PRO Crewdesk take action - drug test needs action.
 *
 * Revision 1.24  2011/05/18 10:07:52  venij
 * PRO - Recruiter Interview results - ui fix
 *
 * Revision 1.23  2011/05/16 12:55:08  venij
 * PRO Crewdesk take action - i9 needs action
 *
 * Revision 1.22  2011/05/12 12:38:57  venij
 * PRO - Recruiter Interview results
 *
 * Revision 1.21  2011/05/06 12:46:35  venij
 * PRO - Recruiter Interview results
 *
 * Revision 1.20  2011/04/28 06:52:47  venij
 * PRO - Associate Documents page - web layer code.
 *
 * Revision 1.19  2011/01/21 10:15:00  venij
 * VMS R2 - Vendor Resource Assignment - resources assigned display list
 *
 * Revision 1.18  2010/12/09 09:34:11  venij
 * Amazon caar import design R2 - Crewdesk Take action CAAR error list - included toggle link to display between unedited records and all records
 *
 * Revision 1.17  2010/12/08 11:29:56  venij
 * Amazon caar import design R2 - Crewdesk Take action CAAR error list
 *
 * Revision 1.16  2010/10/20 11:57:27  venij
 * 7832:code fixes
 *
 * Revision 1.15  2010/10/14 08:15:10  venij
 * 7889:code fixes
 *
 * Revision 1.14  2010/10/11 11:38:38  venij
 * 7884:code fixes
 *
 * Revision 1.13  2010/09/29 12:26:38  venij
 * AMZ Fill to start date(whiteboard) - start sessions add/edit tile
 *
 * Revision 1.12  2010/09/27 08:45:17  sathyan
 * AMZ: ATTENDANCE IMPORT CODE
 *
 * Revision 1.11  2010/09/25 07:55:08  sathyan
 * AMZ: ATTD IMPORT CREWDESK
 *
 * Revision 1.10  2010/09/25 06:46:26  nagaraj
 * amazon whiteboard
 *
 * Revision 1.9  2010/09/22 05:57:24  venij
 * AMZ Fill to start date(whiteboard) - start sessions list tile
 *
 * Revision 1.8  2010/08/26 11:27:09  venij
 * VMS R2 - LM Program codes - web layer completed
 *
 * Revision 1.7  2010/07/08 07:03:23  venij
 * VMS - WO add/edit changes - latest fixes.
 *
 * Revision 1.6  2010/06/09 11:07:44  venij
 * VMS - WO add/edit and history changes
 *
 * Revision 1.5  2010/06/08 07:22:01  nagaraj
 * vms-release1
 *
 * Revision 1.4  2010/05/03 09:28:58  nagaraj
 * 7533
 *
 * Revision 1.3  2010/04/07 12:22:35  venij
 * Amazon PM : web layer code for associate edit follow-up and tickler list page.
 *
 * Revision 1.2  2010/03/13 00:27:57  timp
 * Upgrade for SmartGWT and GWT 2.0 along with new "war" project structure which places web files in the "war" project directory.
 *
 * Revision 1.252  2010/03/05 08:26:24  venij
 * O2I:Audit group by CR : reverting back all web layer changes done earlier.
 *
 * Revision 1.251  2010/03/04 04:42:45  venij
 * O2I:Audit group by CR : web layer changes.
 *
 * Revision 1.250  2010/02/19 15:22:18  gokulane
 * New : MySTN Order Change Reasons
 *
 * Revision 1.249  2010/02/16 05:20:05  venij
 * O2I - WO with no sdlps - coding is complete.
 *
 * Revision 1.248  2009/11/04 15:17:05  gokulane
 * Order Entry - Inv Group - SDLP :: WO Tag pad error list page added
 *
 * Revision 1.247  2009/07/24 03:19:29  timp
 * enhancement #6894 - e-verify take actions
 *
 * Revision 1.246  2009/07/17 10:53:17  gokulane
 * 6878 : Fixed (BG Track link created with new tile BG Tracks)
 *
 * Revision 1.245  2009/07/15 15:35:24  gokulane
 * Edit Archived Background Check Track
 *
 * Revision 1.244  2009/07/14 09:10:23  venij
 * Weekly WO audit - integration of code.
 *
 * Revision 1.243  2009/07/10 08:06:10  nagaraj
 * assoc_bg_check_head
 *
 * Revision 1.242  2009/05/29 11:23:19  venij
 * Weekly WO # audit: web layer code is in progress.
 *
 * Revision 1.241  2009/05/29 11:00:56  venij
 * Weekly WO # audit: added secured resources, web layer code is in progress.
 *
 * Revision 1.240  2009/05/26 11:05:17  venij
 * Add Schedule for Payroll : added web and server code.
 *
 * Revision 1.239  2009/04/14 14:18:07  gokulane
 * New : V_3_3 (Associate Deduction & Billing Generations List)
 *
 * Revision 1.238  2009/03/23 15:09:48  gokulane
 * New : Usecase STN - v_3_3 (Associate Deductions & Exception Billing) LM History
 *
 * Revision 1.237  2009/03/20 13:32:37  gokulane
 * New : Usecase STN - v_3_3 (Associate Payroll Deductions & Billings) History
 *
 * Revision 1.236  2009/03/19 11:48:28  venij
 * Sched week payroll billings - added web layer code.
 *
 * Revision 1.235  2009/03/17 07:45:23  venij
 * Office Deductions and Misc Billings - added web layer code.
 *
 * Revision 1.234  2009/03/12 14:36:08  gokulane
 * New : Usecase STN - v_3_3 (Associate Payroll Deductions & Billings)
 *
 * Revision 1.233  2009/03/12 12:27:58  venij
 * Office Deductions and Misc Billings - added web layer code.
 *
 * Revision 1.232  2009/03/10 11:40:52  venij
 * Office Deductions and Misc Billings - in progress.
 *
 * Revision 1.231  2009/03/06 10:47:17  venij
 * Office Deductions and Misc Billings - in progress.
 *
 * Revision 1.230  2009/03/05 16:06:33  gokulane
 * New : Usecase STN - v_3_3 (Associate Deduction and Exception Billing)
 *
 * Revision 1.229  2009/03/02 17:42:19  mani
 * Payroll Week: Year Wise Pagination.
 *
 * Revision 1.228  2009/02/27 09:33:26  gokulane
 * New : Usecase STN - v_3_3 (Assoc ->Payroll-> Week title with week#)
 *
 * Revision 1.227  2009/02/18 11:28:50  venij
 * Requirements upload : code for web layer.
 *
 * Revision 1.226  2009/02/13 09:34:20  venij
 * WO upload to STN : applied fixes for the history details code.
 *
 * Revision 1.225  2009/02/12 11:25:26  venij
 * WO upload to STN : added code for history pages.
 *
 * Revision 1.224  2009/02/04 11:11:33  venij
 * WO upload to STN : added code for web layer.
 *
 * Revision 1.223  2009/02/02 11:26:32  venij
 * WO upload to STN : added code for UI.
 *
 * Revision 1.222  2009/01/16 11:30:21  gokulane
 * New : Usecase STN - v_3_3_01 Payroll Take Action --> Pending WO Transfer to TW Audit Pagination done!
 *
 * Revision 1.221  2009/01/12 15:18:06  gokulane
 * New : Usecase STN - v_3_3_01 Payroll Take Action --> Pending WO Transfer to TW Audit
 *
 * Revision 1.220  2009/01/08 14:49:51  gokulane
 * New : Usecase STN - v_3_3_01 WO Transfer to TW Audit Transfer history tile
 *
 * Revision 1.219  2008/10/29 13:07:07  gokulane
 * New : Usecase STN - v_3_2 Payroll Import Records List Tile Added
 *
 * Revision 1.218  2008/10/24 11:40:34  venij
 * Payroll - Take Action - Hours Comparision Mismatch.
 *
 * Revision 1.217  2008/10/15 10:35:06  venij
 * Taurus : Making Client digits bold - implemented
 *
 * Revision 1.216  2008/10/14 11:35:53  venij
 * Payroll - Take Action - Hours Comparision Mismatch.
 *
 * Revision 1.215  2008/10/14 11:07:43  venij
 * Payroll - Take Action - Hours Comparision Mismatch.
 *
 * Revision 1.214  2008/10/10 03:47:25  venij
 * Taurus : Assoc Transfer � Phase 3 � Office Config
 *
 * Revision 1.213  2008/10/07 11:11:07  venij
 * Taurus : Assoc Transfer � Phase 3 � Office Config
 *
 * Revision 1.212  2008/09/29 06:24:51  venij
 * Taurus : Making Client digits bold - implemented
 *
 * Revision 1.211  2008/09/12 12:29:39  venij
 * Canada Design
 *
 * Revision 1.210  2008/09/04 06:42:36  mani
 * Payroll Taurus - Configurable Permissions for Manually Entering Time.
 *
 * Revision 1.209  2008/08/28 10:24:28  venij
 * Payroll Taurus - LM Manual Hours Configuration use case
 *
 * Revision 1.208  2008/08/22 06:34:12  sathyan
 * Added code for schedule payroll reports
 *
 * Revision 1.207  2008/08/21 10:49:32  venij
 * Payroll Taurus - WO batch approval use case
 *
 * Revision 1.206  2008/08/14 11:08:47  venij
 * Payroll Taurus - WO batch approval use case
 *
 * Revision 1.205  2008/07/25 15:21:40  gokulane
 * New : Office UDF's Pick from List edit & Delete
 *
 * Revision 1.204  2008/07/25 12:53:44  venij
 * 5710:Fix:Updated bug fix.
 *
 * Revision 1.203  2008/07/24 13:56:58  gokulane
 * New : Office UDF's Pick from List Value Association
 *
 * Revision 1.202  2008/07/16 12:03:08  nagaraj
 * importhours
 *
 * Revision 1.201  2008/06/28 07:04:57  sathyan
 * 5799: Fixed
 *
 * Revision 1.200  2008/06/12 13:47:43  gokulane
 * WO Upload to TempWorks Results Tile
 *
 * Revision 1.199  2008/06/12 11:36:22  gokulane
 * WO Upload to TempWorks Results Tile
 *
 * Revision 1.198  2008/06/12 10:05:02  gokulane
 * WO Upload to TempWorks Results Tile
 *
 * Revision 1.197  2008/06/11 15:02:31  gokulane
 * WO Upload to TempWorks History & Details Tile
 *
 * Revision 1.196  2008/06/11 09:39:51  gokulane
 * WO Upload to TempWorks History & Details Tile
 *
 * Revision 1.195  2008/06/10 12:37:18  gokulane
 * WO Upload to TempWorks History & Details Tile
 *
 * Revision 1.194  2008/06/07 11:12:26  nagaraj
 * for transmit payroll
 *
 * Revision 1.193  2008/06/07 11:00:48  gokulane
 * Payroll : Prototype Import Hours List Details
 *
 * Revision 1.192  2008/06/07 08:59:43  gokulane
 * Payroll : Prototype Import Hours List
 *
 * Revision 1.191  2008/06/07 06:44:59  nagaraj
 * for transmit payroll
 *
 * Revision 1.190  2008/06/06 15:03:01  gokulane
 * Payroll : Prototype changes Transmit Payroll History Details & Errors
 *
 * Revision 1.189  2008/06/05 14:18:00  gokulane
 * Payroll : Prototype changes Transmit Payroll History
 *
 * Revision 1.188  2008/05/29 08:03:57  mani
 * Build Error Rectified.
 *
 * Revision 1.187  2008/05/29 04:59:16  sathyan
 * Added code for wo review
 *
 * Revision 1.186  2008/05/29 03:21:07  venij
 * 5590:Fix:Updated bug fixes.
 *
 * Revision 1.185  2008/05/23 16:04:43  gokulane
 * Payroll : WorkOrders upload to TempWorks
 *
 * Revision 1.184  2008/05/07 15:36:11  gokulane
 * Payroll : Added Payroll Transmit tile on Payroll Tab
 *
 * Revision 1.183  2008/05/07 01:51:10  venij
 * Payroll work orders history details implemented.
 *
 * Revision 1.182  2008/05/07 01:05:41  dmitriyb
 * Payroll - hours import - work in progress
 *
 * Revision 1.179  2008/04/16 22:44:34  venij
 * Added code for Associate Payroll History records - generic code.
 *
 * Revision 1.178  2008/04/15 07:28:21  gokulane
 * Payroll : Take Action (Time with no Associate, Time with Multiple Schedule & Time with Missing Schedule)
 *
 * Revision 1.177  2008/04/10 15:12:58  gokulane
 * Payroll : Payroll - Take Action - Attendance with Missing Time with VO
 *
 * Revision 1.176  2008/04/09 13:35:08  gokulane
 * Payroll : Payroll - Take Action - Attendance with Missing WO's with VO
 *
 * Revision 1.175  2008/03/26 10:50:44  sathyan
 * Added code for Payroll Markups.
 *
 * Revision 1.174  2008/03/25 10:04:56  nagaraj
 * for workorder groups
 *
 * Revision 1.173  2008/03/20 17:31:24  mani
 * LM - Payroll - WO List
 *
 * Revision 1.172  2008/03/17 17:05:50  nagaraj
 * payroll-wo scheme
 *
 * Revision 1.171  2008/03/14 15:20:31  mani
 * Payroll - WO Client Reference - Task #996.
 *
 * Revision 1.170  2008/02/26 05:51:50  mani
 * STN Home Page - Coding.
 *
 * Revision 1.169  2008/02/22 11:41:52  nagaraj
 * payroll
 *
 * Revision 1.168  2007/12/19 07:42:02  sathyan
 * Password Security 5.1F : Added code for password security.
 *
 * Revision 1.167  2007/11/13 12:38:02  mani
 * Merging Transfer Associate - Local Maintenance.
 *
 * Revision 1.166  2007/10/30 22:11:59  dans
 * added checking of security to pages (checks tabs)
 *
 * Revision 1.165  2007/10/26 12:58:44  mani
 * Security: Web Layer Fixes.
 *
 * Revision 1.164  2007/10/22 12:14:29  mani
 * notauthorized*.jsp removing.
 *
 * Revision 1.163  2007/10/12 12:08:11  mani
 * New tag stafftrackSecurityTag added. Modified the existing StafftrackUrlTag.
 *
 * Revision 1.162  2007/01/30 08:58:28  sathyan
 * X510: Merged
 *
 * Revision 1.161  2007/01/08 05:05:13  georgem
 * Work in progress - autocomplete for shift code
 *
 * Revision 1.160  2006/12/27 20:59:17  georgem
 * Upgraded DWR to version 2 (testing needed) and made framework changes 
to include prototype.js and scriptaculous.js into stafftrack
 *
 * Revision 1.159  2006/06/02 00:00:50  dmitriyb
 * Merged feature_HEAD_Unitime_Attendance
 *
 * Revision 1.158.4.3  2006/05/25 00:46:26  dmitriyb
 * Work in Progress
 *
 * Revision 1.158.4.2  2006/05/24 00:36:38  dmitriyb
 * Work in Progress
 *
 * Revision 1.158.4.1  2006/05/17 22:50:41  dmitriyb
 * wip
 *
 * Revision 1.158  2006/04/24 11:40:55  sathyan
 * X332: Merged
 *
 * Revision 1.157  2006/04/14 11:31:44  subhashini
 * C170:Fixed the PCBD for IE
 *
 * Revision 1.156  2006/04/10 06:54:59  subhashini
 * C170:Merged
 *
 * Revision 1.155  2006/04/06 18:39:03  dmitriyb
 * Merged in code for System Access maintenance
 *
 * Revision 1.154  2006/04/03 17:40:36  dans
 * added a message page for crystal report servlet popup window
 *
 * Revision 1.153  2006/03/24 11:07:22  sathyan
 * 4133: FIxed.
 *
 * Revision 1.152  2006/03/06 11:56:12  subhashini
 * B360:Merged
 *
 * Revision 1.151.32.2  2006/03/03 11:21:28  subhashini
 * B360:first CUT done
 *
 * Revision 1.151.32.1  2006/03/02 11:35:57  subhashini
 * B360
 *
 * Revision 1.151  2005/12/27 11:50:18  subhashini
 * C200:Merged from branch
 *
 * Revision 1.150  2005/10/07 14:04:34  dans
 * added code to store state for manual fill list
 *
 * Revision 1.149  2005/10/05 22:07:42  dans
 * added pagination to mfe list
 *
 * Revision 1.148  2005/09/28 11:02:25  subhashini
 * 3716:Fixed
 *
 * Revision 1.147  2005/09/27 13:59:53  subhashini
 * PSA Reqs development
 *
 * Revision 1.146  2005/09/16 20:38:07  dans
 * added context for multiple searches for non go to assoc type
 *
 * Revision 1.145  2005/09/09 11:52:18  sathyan
 * Added constants for PS Import.
 *
 * Revision 1.144  2005/09/06 09:14:08  subhashini
 * 3479:Fixed
 *
 * Revision 1.143  2005/08/22 04:25:20  dans
 * fixes for manual fill
 *
 * Revision 1.142  2005/08/15 16:02:29  dans
 * new manual fill edit methods
 *
 * Revision 1.141  2005/08/01 13:47:13  subhashini
 * B125:Worked on Group Actions for Current Schedules
 *
 * Revision 1.140  2005/07/19 06:09:24  sathyan
 * B330: Change: Added the code for Pre-schedule audit
 *
 * Revision 1.139  2005/07/11 19:40:08  dans
 * orientation rosters fixes
 *
 * Revision 1.138  2005/07/01 20:30:47  dans
 * *** empty log message ***
 *
 * Revision 1.137  2005/06/24 12:24:21  subhashini
 * B340:Changed:Changed code for Sched Generation
 *
 * Revision 1.136  2005/06/23 23:50:33  georgem
 * Finished coding for making security system data - driven.
 *
 * Revision 1.135  2005/06/09 00:55:37  dans
 * modifications for orientation rosters
 *
 * Revision 1.134  2005/05/12 22:21:59  dmitriyb
 * Added the Office Media Code maintenance
 *
 * Revision 1.133  2005/04/20 00:51:56  dans
 * added ability to have wotc tile on either setup or onboarding
 *
 * Revision 1.132  2005/04/19 02:57:53  dans
 * added wotc
 *
 * Revision 1.131  2005/03/26 00:43:31  georgem
 * Working on input bid cards - fixed minor struts configuration problems
 *
 * Revision 1.130  2005/03/17 03:18:07  dans
 * merged reporting branch
 *
 * Revision 1.129  2005/03/11 11:24:51  mousumib
 * B211:Worked on BL
 *
 * Revision 1.128  2005/03/08 08:34:41  rajuk
 * 2020: Change - Whiteboard Groups for crewdesk
 *
 * Revision 1.127  2005/03/02 13:39:30  rajuk
 * 2020:Change - Whiteboard/group related changes
 *
 * Revision 1.126  2005/02/14 06:54:44  mousumib
 * 2502:fix:reworked on this bug to display only open sessions when user clicks on schedule of orientation session
 *
 * Revision 1.125  2005/02/02 04:11:06  rajuk
 * Bug 2498- Change
 *
 * Revision 1.124  2005/01/19 14:00:25  rajuk
 * commit
 *
 * Revision 1.123  2005/01/18 11:25:32  subhashini
 * Changes made to implement bid card type Add and View All and View Active functionalities
 *
 * Revision 1.122  2005/01/13 12:59:46  subhashini
 * Changes made for implementing BidCardAdd Edit functionality
 *
 * Revision 1.121  2005/01/12 12:44:55  mousumib
 * added session variables for view client restrictions
 *
 * Revision 1.120  2004/12/31 00:21:46  dans
 * worked udfs
 *
 * Revision 1.119  2004/12/23 12:27:27  mousumib
 * fixed bug no. 2427
 *
 * Revision 1.118  2004/12/21 12:10:28  mousumib
 * added constant for browse shift notes next link
 *
 * Revision 1.117  2004/12/16 13:25:35  mousumib
 * session variables for shift notes
 *
 * Revision 1.116  2004/12/02 13:01:44  mousumib
 * added EVENT_SCHEDULE_YEARS_LIST and EVENT_SCHEDULE_MONTHS_LIST
 *
 * Revision 1.115  2004/11/24 03:07:59  georgem
 * report writer list tile is finished as much as it can be today
 *
 * Revision 1.114  2004/11/20 00:51:33  dans
 * fixed payrate search
 *
 * Revision 1.113  2004/11/19 11:24:01  sonyj
 * Changes for OtherStafftrackFiles made by Sony.C.Joy
 *
 * Revision 1.112  2004/11/05 11:58:11  mousumib
 * added session variable for session roster tile
 *
 * Revision 1.111  2004/11/03 13:20:30  mousumib
 * constants for view session roster
 *
 * Revision 1.110  2004/10/29 03:59:14  mousumib
 * Constants related to Session w/o results added
 *
 * Revision 1.109  2004/10/25 09:33:09  sathyan
 * Added methods for View More Rosters Implementation
 *
 * Revision 1.108  2004/10/20 10:35:38  mousumib
 * added string to be used by take action tile
 *
 * Revision 1.107  2004/10/19 16:23:55  dans
 * added ON_LOAD_FUNCTION
 *
 * Revision 1.106  2004/10/19 13:32:19  mousumib
 * Strings regarding take action tile
 *
 * Revision 1.105  2004/10/11 11:42:30  mousumib
 * PENDING_WARNING_LETTER_RESULT_ITERATOR added
 *
 * Revision 1.104  2004/10/06 04:11:55  mousumib
 * added SHIFT_NOTES_LIST and SHIFT_NOTES_LIST_SIZE
 *
 * Revision 1.103  2004/09/22 09:55:22  mousumib
 * string CD_WORKFORCE_DETAILS_LIST remaned to CD_WORKFORCE_DETAILS_VO
 *
 * Revision 1.102  2004/09/14 13:38:31  mousumib
 * added attribute keys for pending warning letters
 *
 * Revision 1.101  2004/09/13 11:46:37  subhashini
 * Fixed bug 1691
 *
 * Revision 1.100  2004/09/09 09:38:33  mousumib
 * *** empty log message ***
 *
 * Revision 1.99  2004/09/08 12:26:33  mousumib
 * Added FILTER_BAR_SELECT final string
 *
 * Revision 1.98  2004/09/06 13:48:05  mousumib
 * OPEN_ORDER_SUGGESTED_REQS_LIST and OPEN_ORDER_SUGGESTED_REQS_LIST_SIZE added
 *
 * Revision 1.96  2004/09/03 06:25:49  mousumib
 * OPEN_ORDER_HOT_BLOCK_LIST and OPEN_ORDER_HOT_BLOCK_LIST_SIZE is added
 *
 * Revision 1.95  2004/09/01 07:51:25  sathyan
 * Added entry for current rosters.
 *
 * Revision 1.94  2004/08/31 12:19:12  subhashini
 * Changed made with respect to fetching assoc not sched list and gen weekly sched list
 *
 * Revision 1.93  2004/08/30 06:23:26  dans
 * added Crystal DHTML flag
 *
 * Revision 1.92  2004/08/30 04:12:00  mousumib
 * *** empty log message ***
 *
 * Revision 1.90  2004/08/26 06:14:50  shivak
 * new key ASSOC_TAGPAD_GROUP_PROCESSING is added.
 *
 * Revision 1.89  2004/08/25 12:09:31  mousumib
 * SCHED_ASSOCIATE_EMPTY_LIST is added
 *
 * Revision 1.88  2004/08/25 04:16:36  mousumib
 * SCHED_ATTRIBUTE_LIST_NO_SET_SCHED has been added
 *
 * Revision 1.87  2004/08/24 06:17:07  mousumib
 * A new Attribute SCHED_ASSOCIATE_LIST has been added
 *
 * Revision 1.86  2004/08/12 06:16:49  sathyan
 * Added the entry for current schedules
 *
 * Revision 1.85  2004/08/11 23:58:23  dans
 * added key for mapping of param type to param for reports
 *
 * Revision 1.84  2004/08/09 13:38:11  dans
 * added Crystal servlet
 *
 * Revision 1.83  2004/08/04 05:35:22  sathyan
 * Added a  new entry for associate current attendance.
 *
 * Revision 1.82  2004/08/04 05:27:57  sathyan
 * Added a  new entry for associate current attendance.
 *
 * Revision 1.81  2004/07/27 12:15:19  subhashini
 * Changed made due to Add Requirements
 *
 * Revision 1.80  2004/07/26 12:20:13  sathyan
 * *** empty log message ***
 *
 * Revision 1.79  2004/07/26 11:41:40  subhashini
 * Added the details required for Add and Edit of requirements
 *
 * Revision 1.78  2004/07/23 13:30:11  subhashini
 * *** empty log message ***
 *
 * Revision 1.77  2004/07/23 01:57:43  dans
 * *** empty log message ***
 *
 * Revision 1.76  2004/07/22 11:35:44  subhashini
 * Added a variable to hold the posted or unposted status of the requirement
 *
 * Revision 1.75  2004/07/16 23:10:17  dans
 * added support for tagging associates from a report
 *
 * Revision 1.74  2004/07/16 06:15:26  sathyan
 * *** empty log message ***
 *
 * Revision 1.73  2004/07/12 11:56:55  subhashini
 * Schedule Requirements related changes
 *
 * Revision 1.72  2004/07/09 12:22:14  subhashini
 * Changed made for Scheduling module implementation
 *
 * Revision 1.71  2004/07/08 06:39:15  sathyan
 * *** empty log message ***
 *
 * Revision 1.70  2004/06/29 03:36:12  dans
 * *** empty log message ***
 *
 * Revision 1.69  2004/06/17 12:20:40  shivak
 * new field CANCEL_HR_EVENT is added.
 *
 * Revision 1.68  2004/06/14 11:58:30  subhashini
 * Edited due to the new functionality of closing and opening ticklers
 *
 * Revision 1.67  2004/06/08 06:23:19  dans
 * added reporting
 *
 * Revision 1.64  2004/05/25 04:20:56  shivak
 * field CONFIRM_HR_EVENT is added.
 *
 * Revision 1.63  2004/05/21 12:32:56  nreddy
 * Added attribute key for DrugTest Details
 *
 * Revision 1.62  2004/05/21 06:17:47  shivak
 * *** empty log message ***
 *
 * Revision 1.61  2004/05/20 07:50:07  shivak
 * new field CONFIRM_HR_EVENT added.
 *
 * Revision 1.60  2004/05/20 06:41:35  sathyan
 * Added a new entry for custom fields
 *
 * Revision 1.59  2004/05/19 13:48:22  shivak
 * new Field SCHEDULE_HR_EVENT is added.
 *
 * Revision 1.58  2004/05/12 08:33:51  sathyan
 * Added entry for Associates List
 *
 * Revision 1.57  2004/05/11 12:04:05  nreddy
 * added entry for assocaite work history
 *
 * Revision 1.56  2004/05/11 11:05:51  sathyan
 * Added entry for the associate Info based on a given SSN
 *
 * Revision 1.55  2004/04/28 11:32:14  shivak
 * fiel EVENTSCHEDULE_TILE_TITLE is added.
 *
 * Revision 1.54  2004/04/28 08:54:50  shivak
 * Field CREWDESK_EVENTSCHEDULE_ID is added.
 *
 * Revision 1.53  2004/04/16 20:20:07  georgem
 * Added key for associate info cached object
 *
 * Revision 1.52  2004/04/12 12:49:42  shivak
 * *** empty log message ***
 *
 * Revision 1.51  2004/04/06 12:32:35  bhuvana
 * Associate I9 verification added
 *
 * Revision 1.50  2004/04/05 20:31:39  georgem
 * Added the entry for termination
 *
 * Revision 1.49  2004/04/03 11:38:53  shivak
 * fields  "ASSOCIATE_MAP_MANAGERS" and
 * "ASSOCIATE_MAP_FACILITIES" have been added.
 *
 * Revision 1.48  2004/04/02 15:33:24  shivak
 * field CREWDESK_EVENTSCHEDULING is added.
 *
 * Revision 1.47  2004/04/02 07:45:59  shivak
 * new key ASSOCIATE_MAP is added.
 *
 * Revision 1.46  2004/03/30 11:37:54  nreddy
 * added entry for session W/O result
 *
 * Revision 1.45  2004/03/26 11:46:04  nreddy
 * added new attribute  for valid assignments
 *
 * Revision 1.44  2004/03/25 10:31:49  sathyan
 * Added the AssociatePayRecord entry
 *
 * Revision 1.43  2004/03/24 10:34:32  bhuvana
 * added w4history item
 *
 * Revision 1.42  2004/03/24 03:02:20  nreddy
 * added entry for associate warning.
 *
 * Revision 1.41  2004/03/10 07:02:58  sathyan
 * added the code for assocaite Bio
 *
 * Revision 1.40  2004/03/06 10:07:35  nreddy
 * Aded new  entry for payroll info
 *
 * Revision 1.39  2004/03/02 04:10:38  nreddy
 * attributes are added for program codes
 *
 * Revision 1.38  2004/02/16 04:15:05  sathyan
 * Added a payrate entry
 *
 * Revision 1.37  2004/02/09 09:37:45  sathyan
 * added the entry for Profile Codes.
 *
 * Revision 1.36  2004/02/09 03:47:18  sathyan
 * EEo codes added
 *
 * Revision 1.35  2004/02/06 06:00:49  georgem
 * added more keys for national user maintenance
 *
 * Revision 1.34  2004/02/05 10:03:49  bhuvana
 * National work Comp Codes has been added
 *
 * Revision 1.33  2004/02/05 07:04:47  nreddy
 * added new entries for Master Dept Codes
 *
 * Revision 1.32  2004/02/03 10:36:48  nreddy
 * *** empty log message ***
 *
 * Revision 1.31  2004/02/03 07:36:52  nreddy
 * added new entries for MasterShiftCodes
 *
 * Revision 1.30  2004/02/02 12:55:21  bhuvana
 * Occurrence Reason Codes has been added
 *
 * Revision 1.29  2004/02/02 09:10:45  bhuvana
 * Constants for occurrence reason codes added
 *
 * Revision 1.28  2004/01/30 03:46:16  georgem
 * working on national users maintenance - debugging
 *
 * Revision 1.27  2004/01/29 05:17:26  nreddy
 * added keys for ClientDepatmentCodes
 *
 * Revision 1.26  2004/01/27 06:13:39  nreddy
 * added variable for clientshifts
 *
 * Revision 1.25  2004/01/27 04:58:39  sathyan
 * added the entry for background check reasons
 *
 * Revision 1.24  2004/01/26 15:02:11  dans
 * added variables for clients
 *
 * Revision 1.23  2004/01/19 08:33:47  sathyan
 * added drug test reasons
 *
 * Revision 1.22  2004/01/17 05:59:22  bhuvana
 * *** empty log message ***
 *
 * Revision 1.21  2004/01/16 03:12:07  dans
 * *** empty log message ***
 *
 * Revision 1.20  2004/01/14 10:00:50  bhuvana
 * Attributes for attendance codes are added
 *
 * Revision 1.19  2004/01/12 10:21:47  nreddy
 * National termination code Atribute key's are added
 *
 * Revision 1.18  2004/01/12 10:19:50  nreddy
 * National termination code Atribute key's are added
 *
 * Revision 1.17  2004/01/10 00:32:31  dans
 * added OFFICE_LIST
 *
 * Revision 1.16  2004/01/07 10:28:56  sathyan
 * Made entries for burden rates
 *
 * Revision 1.15  2004/01/07 10:23:15  sathyan
 * Made entries for burden rates
 *
 * Revision 1.14  2003/12/30 12:46:07  bhuvana
 * *** empty log message ***
 *
 * Revision 1.13  2003/12/30 08:44:29  sathyan
 * Added the entry for Hr documents
 *
 * Revision 1.12  2003/12/26 00:38:45  georgem
 * added ActionTileMenu request type
 *
 * Revision 1.11  2003/12/24 05:10:36  sathyan
 * added the entry for tickler topic
 *
 * Revision 1.10  2003/12/22 18:16:28  georgem
 * initial code for local user maintenance
 *
 * Revision 1.9  2003/12/18 17:48:08  dans
 * fixed compiler error
 *
 * Revision 1.8  2003/12/18 17:41:46  dans
 * *** empty log message ***
 *
 * Revision 1.5  2003/12/16 03:05:08  georgem
 * added constants for client dept/shift lists for pull downs
 *
 * Revision 1.4  2003/12/10 06:20:32  sathyan
 * added Hr Events
 *
 * Revision 1.3  2003/12/09 20:05:36  dans
 * added code to not refresh form on validation error
 *
 * Revision 1.2  2003/12/09 00:15:17  dans
 * *** empty log message ***
 *
 * Revision 1.36  2003/12/08 11:26:35  bhuvana
 * One more constant related to Attendance Policy has been added
 *
 * Revision 1.35  2003/12/08 10:39:28  bhuvana
 * The attribute keys for attendance policy is added
 *
 * Revision 1.34  2003/12/08 10:34:54  nreddy
 * added roster groups attibute keys
 *
 * Revision 1.33  2003/12/03 12:18:25  sathyan
 * Commit after adding the client contacts related code
 *
 * Revision 1.32  2003/12/03 01:36:23  dans
 * *** empty log message ***
 *
 * Revision 1.31  2003/12/02 00:10:30  dans
 * added office_warning_letters
 *
 * Revision 1.30  2003/11/28 08:10:24  nreddy
 * *** empty log message ***
 *
 * Revision 1.29  2003/11/26 22:33:55  georgem
 * added SDLP-related constants
 *
 * Revision 1.28  2003/11/18 08:40:40  bhuvana
 * The entry for agencies has been added
 *
 * Revision 1.27  2003/11/18 00:51:20  dans
 * Added Add/Edit/Find funcationality
 *
 * Revision 1.26  2003/11/17 04:13:32  dans
 * started creating office udf
 *
 * Revision 1.25  2003/11/13 21:37:05  dans
 * continued working on office overview
 *
 * Revision 1.24  2003/11/13 09:47:04  bhuvana
 * The attribute for Agencies has been added
 *
 * Revision 1.23  2003/11/07 03:01:51  dans
 * worked on local and national maintenance
 *
 * Revision 1.22  2003/11/07 02:16:24  georgem
 * work in progress - debugging peoplescout job codes maintenance
 *
 * 
 */
public interface AttributeKeys
{
	public static String OFFICE_HR_EVENT_SCHED = "OFFICE_HR_EVENT_SCHED";
    public static String USER_REPORTS = "USER_REPORTS";
	public static String DHTML_CRYSTAL_PRINT = "DHTML_CRYSTAL_PRINT";
	public static String SEARCH_METHOD = "SearchMethod";
	public static String SEARCH_METHOD_SUBMITTED = "submitted";
	public static String SEARCH_METHOD_NOT_SUBMITTED = "not submitted";
	public static String SEARCH_METHOD_ASSOC_SUBMITTED = "assocSubmitted";
	public static String REPORT_ID = "reportId";
	public static String REPORT_WRITER_DATE_VALUE = "REPORT_WRITER_DATE_VALUE";
	public static String REPORT_WRITER_NUMBER_VALUE = "REPORT_WRITER_NUMBER_VALUE";
	public static String USR_RPT_PRMS_BY_TYPE = "USR_RPT_PRMS_BY_TYPE";
	public static String REFRESH_FROM_DATABASE = "REFRESH_FROM_DATABASE";
	
	public static String CHECK_OFFICE_TASK_ROLE_ACCESS = "CHECK_OFFICE_TASK_ROLE_ACCESS";
	
	// menu action tile request type
	public static String ACTION_TILE_MENU_REQUEST_TYPE = "ActionTileMenu_type";
	//Security related
	public static final String USER_CONTEXT = "USER_CONTEXT";
	public static final String CHECK_SECURITY = "CheckSecurity";
	public static final String CHECK_SECURITY_LINK = "CheckSecurityLink";
	public static final String CHECK_ROLE_SECURITY = "CheckRoleSecurity";
	public static final String CHECK_OFFICE_TASK_LEVEL_SECURITY = "CheckOfficeTaskLevelSecurity";

	//Associate 

	//Tickler 
	public static String TICKLER_TILE_REQUEST_TYPE = "TicklerTile_type";
	public static String FOLLOWUP_ADD_EDIT_TILE_REQUEST_TYPE = "FollowupAddEditTile_type";

	public static final String OFFICE_TICKLER_TYPES = "OFFICE_TICKLER_TYPES";

	public static final String ASSOCIATE_TICKLERS = "ASSOCIATE_TICKLERS";
	public static final String ASSOCIATE_TICKLER_FOLLOWUPS = "ASSOCIATE_TICKLER_FOLLOWUPS";
	public static final String NUMBER_OF_FOLLOWUPS = "NUMBER_OF_FOLLOWUPS";

	public static final String TICKLER_CONTACT_BY_LIST = "TICKLER_CONTACT_BY_LIST";
	public static final String TICKLER_CONTACT_BY = "TICKLER_CONTACT_BY";
	public static final String TICKLER_STATUS = "TICKLER_STATUS";

	//Select option collections
	public static final String LT_TABLE_VOS = "LT_TABLE_VOS";
	public static final String LT_TABLE_HTML_SELECT = "LT_TABLE_HTML_SELECT";

	//Associate collections

	//Tickler collections
	public static final String TICKLER_CONTACT_BY_HTML_OPTIONS = "TICKLER_CONTACT_BY_HTML_OPTIONS";

	//Followup collections
	public static final String FOLLOWUP_CONTACTBY_HTML_OPTIONS = "FOLLOWUP_CONTACTBY_HTML_OPTIONS";

	//Office collections

	public static final String OFFICE_PAY_RATES = "OFFICE_PAY_RATES";
	public static String OFFICE_PAY_RATE_TILE_REQUEST_TYPE = "PayRateAddEditTile_type";

	//TimeBlock collections
	public static final String OFFICE_TIMEBLOCKS = "OFFICE_TIMEBLOCKS";
	public static final String OFFICE_TIMEBLOCKS_ADDEDIT_TILE_TYPE = "TimeBlocksAddEditTile_type";
	// Office Termination collection
	public static final String OFFICE_TERMINATIONCODES = "OFFICE_TERMINATIONCODES";

	//Backup Agencies
	public static final String OFFICE_AGENCIES = "OFFICE_AGENCIES";
	public static final String AGENCIES_ADDEDIT_TILE_TYPE = "AgenciesAddEditTile_type";

	//Page View Controller attributes for setting up page
	public static final String MENU_IMAGE = "MENU_IMAGE";
	public static final String LINK_MENU = "LINK_MENU";
	public static final String LINK_ITEMS_LIST = "LINK_ITEMS_LIST" ;
	public static final String MENU_ACTIONS_LIST = "MENU_ACTIONS_LIST";
	public static final String TILE_ACTIONS_LIST = "TILE_ACTIONS_LIST";
	public static final String HEADER_NAV = "HEADER_NAV";
	public static final String HEADER_SUB = "HEADER_SUB";

	// PeopleScout Job Codes
	public static final String OFFICE_PEOPLESCOUT_JOBCODES = "OFFICE_PEOPLESCOUT_JOBCODES";
	public static final String PEOPLESCOUT_JOBCODE_ADDEDIT_TILE_TYPE = "PeopleScoutJobCodeAddEditTile_type";

	// Office Media Codes
	public static final String OFFICE_MEDIA_CODES = "OFFICE_MEDIA_CODES";
	public static final String MEDIA_CODE_ADDEDIT_TILE_TYPE = "PeopleScoutJobCodeAddEditTile_type";

	// System Roles
	public static final String SYSTEM_ROLES = "SYSTEM_ROLES";
	public static final String SYSTEM_ACCESS_RIGHTS = "SYSTEM_ACCESS_RIGHTS";
	//public static final String SYSTEM_ROLE_ADDEDIT_TILE_TYPE = "SystemRoleAddEditTile_type";

	//Office Config
	public static final String OFFICE_OVERVIEW = "OFFICE_OVERVIEW";
	public static final String OFFICE_LIST = "OFFICE_LIST";
	public static final String OFFICE_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeAddEditTile_type";

	// Termination Codes
	public static final String TERMINATION_CODES_ADDEDIT_TILES_TYPE = "TerminationCodesAddEditTile_type";
	// National Termination codes
	//	National termination codes
	public static final String NATIONAL_TERMINATION_CODES = "NATIONAL_TERMINATION_CODES";
	public static final String NATIONAL_TERMINATION_CODES_ADDEDIT_TILES_TYPE =
		"NationalTerminationCodesAddEditTile_type";
	//Office Udf
	public static final String LT_UDF_TYPE = "LT_UDF_TYPE";
	public static final String LT_UDF_USAGE = "LT_UDF_USAGE";
	public static final String OFFICE_UDF = "OFFICE_UDF";
	public static final String OFFICE_UDF_VALUE = "OFFICE_UDF_VALUE";

	//Associate M.AP.
	public static final String ASSOCIATE_MAP = "ASSOCIATE_MAP";

    // Crew Desk Event Scheduling.
	public static final String CREWDESK_EVENTSCHEDULING = "CREWDESK_EVENTSCHEDULING";
	public static final String CREWDESK_EVENTSCHEDULE_ID = "CREWDESK_EVENTSCHEDULE_ID";
	public static final String EVENTSCHEDULE_TILE_TITLE = "EVENTSCHEDULE_TILE_TITLE";
	public static final String EVENTSCHEDULE_HRPHASE_NAME = "EVENTSCHEDULE_HRPHASE_NAME";
    
    //Crew DESK Rosters
	public static final String CREWDESK_ROSTERS = "CREWDESK_ROSTERS";
	public static final String CREWDESK_ROSTERS_BREAK_BY_BLOCK = "CREWDESK_ROSTERS_BREAK_BY_BLOCK";	
    public static final String CREWDESK_ASSOCIATES_FOR_ROSTER = "CREWDESK_ASSOCIATES_FOR_ROSTER";
    public static final String SCHED_WEEKS_FOR_OFFICE = "SCHED_WEEKS_FOR_OFFICE";
    public static final String SCHED_MONTHS_FOR_OFFICE = "SCHED_MONTHS_FOR_OFFICE";
    
    
    
    
	public static final String OFFICE_UDF_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeUdfAddEditTile_type";
	public static final String OFFICE_UDF_VALUE_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeUdfValueAddEditTile_type";

	//Office warnings
	public static final String OFFICE_WARNING_LETTERS = "OFFICE_WARNING_LETTERS";
	public static final String OFFICE_WARNING_LETTER_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeWarningLetterAddEditTile_type";

	//Office HR Events
	public static final String OFFICE_HR_EVENTS = "OFFICE_HR_EVENTS";
	public static String HR_EVENT_ADDEDIT_TILE_TYPE = "HrEventAddEditTile_type";
	public static String HR_EVENT_VIEWALL_TYPE = "viewAll_type";

	//Office HR Events
	public static final String OFFICE_HR_DOCUMENTS = "OFFICE_HR_DOCUMENTS";
	public static String HR_DOCUMENT_ADDEDIT_TILE_TYPE = "HrDocumentAddEditTile_type";
	public static String HR_DOCUMENT_VIEWALL_TYPE = "viewAll_type";

	//Office warnings points
	public static final String OFFICE_WARNING_POINTS = "OFFICE_WARNING_POINTS";
	public static final String OFFICE_WARNING_POINTS_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeWarningPointsAddEditTile_type";

	//Office Attd Violation rule
	public static final String OFFICE_ATTD_VIOLATION_RULE = "OFFICE_ATTD_VIOLATION_RULE";
	public static final String OFFICE_ATTD_VIOLATION_RULE_ADD_EDIT_TILE_REQUEST_TYPE =
		"OfficeAttdViolationRuleAddEditTile_type";

	//Lt table realetd to Attendance policy
	public static final String LT_VIOLATION_FREQ = "LT_VIOLATION_FREQ";

	//ActionForms

	//Associate Forms

	//Tickler Forms
	public static final String TICKLER_FORM = "tickler";
	public static final String FOLLOWUP_FORM = "followup";

	// SDLP
	public static final String SDLP_PROD_SHIFT = "SDLP_PROD_SHIFT";
	public static final String SDLP_CLIENT_SHIFT = "SDLP_CLIENT_SHIFT";
	public static final String SDLP_PROD_DEPT = "SDLP_PROD_DEPT";
	public static final String SDLP_PROD_LINE = "SDLP_PROD_LINE";
	public static final String SDLP_PROD_PROGRAM = "SDLP_PROD_PROGRAM";



	public static final String CLIENT_DEPT_CODES_LIST = "CLIENT_DEPT_CODES_LIST";
	public static final String CLIENT_SHIFTS_LIST = "CLIENT_SHIFTS_LIST";
	public static final String EXPANDED_SHIFT_CODE_USED = "EXPANDED_SHIFT_CODE_USED";

	//WhiteBoard Groups
	public static final String WHITE_BOARD_GROUPS = "WHITE_BOARD_GROUPS";
	public static final String WHITE_BOARD_GROUPS_ADDEDIT_TILES_TYPE = "WhiteBoardGroupsAddEditTile_type";
	
	public static final String DAYS_LIST = "DAYS_LIST";
	public static final String DISABLE_ARROW = "disable_arrow";
	
	//Roster Groups

	public static final String SCHEDULE_ROSTER_GROUPS = "SCHEDULE_ROSTER_GROUPS";
	public static final String SCHEDULE_ROSTER_GROUPS_ADDEDIT_TILES_TYPE = "RosterGroupsAddEditTile_type";

	//CLIENT CONTACTS
	public static final String CLIENT_CONTACTS = "CLIENT_CONTACTS";
	public static String OFFICE_CLIENT_CONTACT_REQUEST_TYPE = "ClientContactAddEditTile_type";

	public static String OFFICE_BURDEN_TABLE_REQUEST_TYPE = "BurdenAddEditTile_type";
	public static String BURDEN_RATES = "BURDEN_RATES";
	//TODO: Needs to add a constant for STAFF_MGMT_NEWS
	// public static String STAFF_MGMT_NEWS = "STAFF_MGMT_NEWS";

	public static String OFFICE_CARE_FACILITIES = "OFFICE_CARE_FACILITIES";

	//Office Map Facilities
	public static String OFFICE_CARE_FACILITY_ADD_EDIT_TILE_REQUEST_TYPE = "OfficeCareFacilityAddEditTile_type";
	public static final String WORK_ORDERS = "WORK_ORDERS";
	public static final String WORK_ORDERS_ADDEDIT_TILES_TYPE = "WorkOrdersAddEditTile_type";
	public static final String WORK_ORDER_CLIENT_REFERENCE = "WORK_ORDER_CLIENT_REFERENCE";
	public static final String WORK_ORDER_CLIENT_REFERENCE_ADDEDIT_TILES_TYPE = "WorkOrderClientReferenceAddEditTile_type";

	//Payroll Tile 
	public static final String WORK_ORDER_GROUP = "WORK_ORDER_GROUP";
	public static final String WORK_ORDER_GROUP_ADDEDIT_TILES_TYPE = "WorkOrderGroupAddEditTile_type";
	public static final String PAYROLL_TICKLER_RULE = "PAYROLL_TICKLER_RULE";
	public static final String PAYROLL_TICKLER_RULE_ADDEDIT_TILES_TYPE = "PayrollTicklerRuleAddEditTile_type";

	// Local user maintenance
	public static final String USER_LIST = "USER_LIST";
	

	//National Attendance Codes
	public static final String ATTENDANCE_CODES = "ATTENDANCE_CODES";
	public static final String ATTENDANCE_CODES_ADD_EDIT_TILE_TYPE = "AttendanceCodesAddEditTile_type";

	//National Occurrence Reason Codes
	public static final String OCCURRENCE_REASON_CODES = "OCCURRENCE_REASON_CODES";
	public static final String OCCURRENCE_REASON_CODES_ADD_EDIT_TILE_TYPE = "OccurrenceReasonCodesAddEditTile_type";

	//National Work Comp codes
	public static final String WORK_COMP_CODES = "WORK_COMP_CODES";
	public static final String WORK_COMP_CODES_ADD_EDIT_TILE_TYPE = "WorkCompCodesAddEditTile_type";

	// National user maintenance
	public static final String NATIONAL_USER_LIST = "NATIONAL_USER_LIST";
    public static final String NATIONAL_USER_SEARCH_VO = "NATIONAL_USER_SEARCH_VO"; 
	//Drug Test Reasons.
	public static final String DRUG_TEST_REASONS = "DRUG_TEST_REASONS";

	//BackGround check  Reasons.
	public static final String BACKGROUND_CHECK_REASONS = "BACKGROUND_CHECK_REASONS";

	//National Pay Rate Reason Codes
	public static final String NATIONAL_PAY_RATE_REASON_CODES = "NATIONAL_PAY_RATE_REASON_CODES";
	//Client
	public static final String CLIENTS_LIST = "CLIENTS_LIST";
	public static final String CLIENTS_ADD_EDIT_TILE_REQUEST_TYPE = "ClientsAddEditTile_type";
	//	Client department codes
	public static final String SDLP_CLIENT_DEPT_CODE_LIST = "CLIENT_DEPT_CODE_LIST";
	public static final String SDLP_CLIENT_DEPT_CODE_ADD_EDIT_TILE_REQUEST_TYPE = "ClientDeptCodeAddEditTile_type";
	public static final String SDLP_CLIENT_DEPT_CODE = "SDLP_CLIENT_DEPT_CODE";

	//	Client Shift
	
	public static final String SDLP_MASTER_SHIFT_CODE_LIST = "MASTER_SHIFT_CODE_LIST";
	public static final String SDLP_MASTER_SHIFT_CODE_ADD_EDIT_TILE_REQUEST_TYPE = "MasterShiftCodeAddEditTile_type";
	public static final String SDLP_MASTER_SHIFT_CODE = "SDLP_MASTER_SHIFT_CODE";


	// for Master Dept codes
	public static final String SDLP_MASTER_DEPT_CODE_LIST = "SDLP_MASTER_DEPT_CODE_LIST";
	public static final String SDLP_MASTER_DEPT_CODE_ADD_EDIT_TILE_REQUEST_TYPE = "MasterDeptCodeAddEditTile_type";
	public static final String SDLP_MASTER_DEPT_CODE = "SDLP_MASTER_DEPT_CODE";
	
	//EEO codes
	public static final String EEO_CODES = "EEO_CODES";
	
	//Profile codes
	public static final String PROFILE_CODES = "PROFILE_CODES";
	// Program codes
	public static final String PROGRAM_CODES = "PROGRAM_CODES";
	public static final String PAYROLL_SETUP = "PAYROLL_SETUP";
	
	//AssocaiteBIO
	public static final String ASSOCIATE_BIO = "ASSOCIATE_BIO";
	public static final String ASSOCIATE_WARNINGS = "ASSOCIATE_WARNINGS";
	
	public static final String ASSOCIATE_W4HISTORY = "ASSOCIATE_W4HISTORY";
	public static final String ASSOCIATE_I9VERIFICATION = "ASSOCIATE_I9VERIFICATION";
	
	public static final String ASSOCIATE_PAY_RECORD = "ASSOCIATE_PAY_RECORD";
	// valid assignments
	public static final String ASSOCIATE_VALID_ASSIGNMENTS = "ASSOCIATE_VALID_ASSIGNMENTS";
	public static final String SESSIONS_WO_RESULTS = "SESSIONS_WO_RESULTS";
	public static final String SESSIONS_WO_RESULTS_LIST_SIZE = "SESSIONS_WO_RESULTS_LIST_SIZE";
	public static final String SESSIONS_WO_RESULTS_TILE_TITLE="SESSIONS_WO_RESULTS_TILE_TITLE";
	public static final String ASSOCIATE_TERMINATIONS = "ASSOCIATE_TERMINATIONS";
	
	// Cached Associate Info
	public static final String ASSOCIATE_CACHED_INFO = "ASSOCIATE_CACHED_INFO";
	
	public static final String ASSOCIATE_INFO_BY_SSN_AND_OFFICE = "ASSOCIATE_INFO_BY_SSN_AND_OFFICE";
	
	public static final String ASSOCIATE_INFO_BY_SSN = "ASSOCIATE_INFO_BY_SSN";
	public static final String ASSOCIATE_WORK_HISTORY = "ASSOCIATE_WORK_HISTORY";
	
	public static final String OTHER_STAFFTRACK_FILES = "OTHER_STAFFTRACK_FILES";
	
	//SCHEDULE_HR_EVENT for the module A252
	public static final String SCHEDULE_HR_EVENT = "SCHEDULE_HR_EVENT";	
	public static final String SCHEDULE_HR_EVENT_LIST_SIZE = "SCHEDULE_HR_EVENT_LIST_SIZE";	
	public static final String CONFIRM_HR_EVENT = "CONFIRM_HR_EVENT";
	public static final String CANCEL_HR_EVENT = "CANCEL_HR_EVENT";
		
	//Custom Fields
	public static final String CUSTOM_FIELDS= "CUSTOM_FIELDS";
	public static final String DRUG_TEST_DETAILS= "DRUG_TEST_DETAILS";
	
	//Reporting
	public static final String REPORTING_CONTEXT = "REPORTING_CONTEXT";
    
    //Associate Hr Documents    
    public static final String ASSOCIATE_HR_DOCUMENTS = "ASSOCIATE_HR_DOCUMENTS";
    
    //Associate Schedule
    public static final String ASSOCIATE_CURRENT_SCHEDULE = "ASSOCIATE_CURRENT_SCHEDULE"; 
    
     //Associate Hr Event record
    public static final String ASSOCIATE_HR_EVENT_RECORD = "ASSOCIATE_HR_EVENT_RECORD";  
    
	public static final String FOCUS_ELEMENT = "FOCUS_ELEMENT";  
    
    //Set up associate schedules.
    public static final String ASSOCIATE_SCHEDULES = "ASSOCIATE_SCHEDULES";
    
    /** Set up the list of the scheduling weeks.    */
    public static final String SCHEDULING_WEEKS = "SCHEDULING_WEEKS";
    
    //Set up the list of scheduled requirements 
    public static final String SCHEDULED_REQS = "SCHEDULING_REQS";
    
    //Indicates if the requirement is Posted / Unposted
    public static final String SCHED_REQS_POSTING = "SCHED_REQS_POSTING";
    
    //Indicates the request type of the schedule requirements list tile
    public static final String SCHED_REQS_LIST_TILE_REQUEST_TYPE = "SchedReqsList_type";
    
    //  Indicates the request type of the requirements tile
    public static final String REQS_TILE_REQUEST_TYPE = "RequirementTile_type";
    
    
    //Set up the associate requested days off
    public static final String ASSOCIATE_DAYS_OFF = "ASSOCIATE_DAYS_OFF";
    
    public static final String REPORT_TAGGED_ASSOCIATE_LIST = "REPORT_TAGGED_ASSOCIATE_LIST";
    
    public static final String REPORT_TAGGED_ASSOCIATE_AARLIST = "REPORT_TAGGED_ASSOCIATE_AARLIST";
 
    //Attendance History
    public static final String ASSOCIATE_ATTENDANCE_HISTORY = "ASSOCIATE_ATTENDANCE_HISTORY";

    //  Attendance 
      public static final String ASSOCIATE_CURRENT_ATTENDANCE = "ASSOCIATE_CURRENT_ATTENDANCE";
   
    //Generic 
    public static final String SFW_PAGE_CONTEXT="SFW_PAGE_CONTEXT";
    
    //Associates without home assignments
    public static String SCHED_ASSOCIATE_LIST="SCHED_ASSOCIATE_LIST";
    
//  Associates with No set Schedules
    public static String SCHED_ASSOCIATE_LIST_NO_SET_SCHED="SCHED_ASSOCIATE_LIST_NO_SET_SCHED";
    
//  Empty List of Associate details
    public static String SCHED_ASSOCIATE_EMPTY_LIST="SCHED_ASSOCIATE_EMPTY_LIST";
    
    //Group Processing Constant, to hold session object.
    public static String ASSOC_TAGPAD_GROUP_PROCESSING ="GROUP_PROCESSING"; 
    
    public static String ASSOC_AARTAGPAD_GROUP_PROCESSING ="AAR_GROUP_PROCESSING"; 
    
    public static String ASSOC_CURRENT_SCHED_VIOLATED="ASSOC_CURRENT_SCHED_VIOLATED";
    
    public static String ASSOC_CURRENT_SCHED_REQ_SIZE ="ASSOC_CURRENT_SCHED_REQ_SIZE";
    
    /** Set up the list of the assocs Not scheduled but scheduleable.    */
    public static final String ASSOC_NOT_SCHED = "ASSOC_NOT_SCHED";
    
    public static final String ASSOC_NOT_SCHED_DETAILS = "ASSOC_NOT_SCHED_DETAILS";
    
    public static final String REQ_SCHED_ANALYSIS = "REQ_SCHED_ANALYSIS";
    
//  Group Processing Constant, to hold session object.
    public static String CD_WORKFORCE_DETAILS_VO ="CD_WORKFORCE_DETAILS_VO";
    public static String SESSION_ROSTER_CONTEXT = "SESSION_ROSTER_CONTEXT"; 
    
    /** Set up the list of the generated weekly schedule list  */
    public static final String GEN_WEEKLY_SCHED_LIST = "GEN_WEEKLY_SCHED_LIST";
    
    // Storing the selected values for the genarte weekly schedule list in session
    public static final String GEN_WEEKLY_FORM_VALUE = "GEN_WEEKLY_FORM_VALUE";
    
    public static final String GEN_WEEKLY_QUERY_PRAM_CACHED = "GEN_WEEKLY_QUERY_PRAM_CACHED";
    
    //Storing the unique list of sched dates
    public static final String GEN_WEEKLY_FORM_SCHED_DATE_LIST = "GEN_WEEKLY_FORM_SCHED_DATE_LIST";
    
    /** Set up the list of the Open Order Hot Blocks list  */
    public static final String OPEN_ORDER_HOT_BLOCK_LIST = "OPEN_ORDER_HOT_BLOCK_LIST";
    
    //Empty List of Associate details
    public static final String OPEN_ORDER_HOT_BLOCK_LIST_SIZE="OPEN_ORDER_HOT_BLOCK_LIST_SIZE";
    
    /** Set up the list of the Open Order Suggested Reqs list  */
    public static final String OPEN_ORDER_SUGGESTED_REQS_LIST = "OPEN_ORDER_SUGGESTED_REQS_LIST";
    
    //Empty List of Open Order Suggested Reqs List
    public static final String OPEN_ORDER_SUGGESTED_REQS_LIST_SIZE="OPEN_ORDER_SUGGESTED_REQS_LIST_SIZE";
    
    //Select Option of filter bar
    public static final String FILTER_BAR_SELECT="FILTER_BAR_SELECT";
    
    //Session variable POSTED
    public static final String SESSION_VAR_POSTED="SESSION_VAR_POSTED";
    
    //Session variable for warning letters
    public static final String WARNING_LETTERS_DETAILS_LIST="WARNING_LETTERS_DETAILS_LIST";
    //warning letters page search  or results display  is indiacted by a true or false value of the same.
    //True means it's search . False means it's in display .
    public static final String PENDING_WARNING_LETTERS_SEARCH_MODE="PENDING_WARNING_LETTERS_SEARCH_MODE";
    //  Session variable for warning letters list size
    public static final String WARNING_LETTERS_DETAILS_LIST_SIZE="WARNING_LETTERS_DETAILS_LIST_SIZE";
    //PENDING WARNING LETTER RESULT ITERATOR
    public static final String PENDING_WARNING_LETTER_RESULT_ITERATOR="PENDING_WARNING_LETTER_RESULT_ITERATOR";
    
    public static final String PENDING_WARNING_LETTER_FORM ="PENDING_WARNING_LETTER_FORM";
    
    public static final String PENDING_WARNING_VO="PENDING_WARNING_VO";
    
    
//  Session variable for Shift Notes
    public static final String SHIFT_NOTES_LIST="SHIFT_NOTES_LIST";
    public static final String SHIFT_NOTES_LIST_SIZE="SHIFT_NOTES_LIST_SIZE";
    public static final String SHIFT_NOTES_CURRENT_MONTH="SHIFT_NOTES_CURRENT_MONTH";
    public static final String SHIFT_NOTES_START_MONTH_YEAR="SHIFT_NOTES_START_MONTH_YEAR";
    
    public static final String ON_LOAD_FUNCTION="ON_LOAD_FUNCTION";
    public static final String AFTER_ON_LOAD_FUNCTION="AFTER_ON_LOAD_FUNCTION";
    
    //Session variables for Take Action
    public static final String TAKE_ACTION_VO="TAKE_ACTION_VO";   
    public static final String DETAILS_FOR_ALL_OFFICE_HR_EVENTS_LIST="DETAILS_FOR_ALL_OFFICE_HR_EVENTS_LIST";
    public static final String DETAILS_FOR_ALL_OFFICE_HR_EVENTS_LIST_SIZE="DETAILS_FOR_ALL_OFFICE_HR_EVENTS_LIST_SIZE";
    public static final String TAKE_ACTION_EVERIFY_COUNTS = "TAKE_ACTION_EVERIFY_COUNTS";
    public static final String OFFICE_WITH_NO_START_SESSIONS_LIST_SIZE="OFFICE_WITH_NO_START_SESSIONS_LIST_SIZE";
    
    //Session Variables for Session Roster View Tile
    public static final String SESSION_ROSTER_VO_LIST="SESSION_ROSTER_VO_LIST";
    public static final String SESSION_ROSTER_VO_LIST_SIZE="SESSION_ROSTER_VO_LIST_SIZE";
    public static final String SESSION_ROSTER_HEADER_LIST="SESSION_ROSTER_HEADER_LIST";
    public static final String SESSION_ROSTER_TILE_NAME="SESSION_ROSTER_TILE_NAME";
    public static final String SESSION_ROSTER_DOCUMENT_LIST_SIZE="SESSION_ROSTER_DOCUMENT_LIST_SIZE";
    public static final String SESSION_ROSTER_FORM="SESSION_ROSTER_FORM";
    public static final String NEED_CALENDAR = "NEED_CALENDAR";
    public static final String NEED_SCRIPTACULOUC = "NEED_SCRIPTACULOUC"; 
    public static final String NEED_DWR = "NEED_DWR";
    
    // Session variable for report writer reports list
    public static final String REPORT_WRITER_REPORTS_LIST = "REPORT_WRITER_REPORTS_LIST";
    
    public static final String EVENT_SCHEDULE_YEARS_LIST="EVENT_SCHEDULE_YEARS_LIST";
    public static final String EVENT_SCHEDULE_MONTHS_LIST="EVENT_SCHEDULE_MONTHS_LIST";
    
    //session variable for Shift Notes
    public static final String SHIFT_NOTES_YEARS_LIST="SHIFT_NOTES_YEARS_LIST";
    public static final String SHIFT_NOTES_MONTHS_LIST="SHIFT_NOTES_MONTHS_LIST";
    
    //Session Variables for flex
    
    //Session Variables for Client Restrictions
    public static final String CLIENT_RESTRICTIONS_LIST="CLIENT_RESTRICTIONS_LIST";
    public static final String CLIENT_RESTRICTIONS_LIST_SIZE="CLIENT_RESTRICTIONS_LIST_SIZE";
    
    //For Bid Card Types
    public static final String BID_CARD_TYPES_LIST = "BID_CARD_TYPES_LIST";
    
    //For Recently Input Bid Card Types
    public static final String RECENTLY_INPUT_BID_CARD_LIST = "RECENTLY_INPUT_BID_CARD_LIST";
    public static final String RECENTLY_INPUT_BID_CARD_VO = "RECENTLY_INPUT_BID_CARD_VO";
    
    //wotc
    public static final String WOTC_FORM = "wotcForm";
    public static final String WOTC = "wotc";
    public static final String WOTC_TYPE = "wotc_type";
    public static final String WOTC_ADDITIONAL_DOC_LIST = "WOTC_ADDITIONAL_DOC_LIST";
    
    public static final String LOCAL_USER_ROLE_LIST = "LOCAL_USER_ROLE_LIST";
    
    public static final String ASSOCIATE_ISSUES_LIST = "ASSOCIATE_ISSUES_LIST";
    public static final String PS_ASSOCIATES_LIST = "PS_ASSOCIATES_LIST";
    
    public static final String PS_REQS_ISSUES_LIST = "PS_REQUIREMENTS_ISSUES_LIST";
    public static final String PS_REQS_PROC_EXECUTED = "PS_REQS_PROC_EXECUTED";
    public static final String PS_REQS_DEATILS_VO  = "PS_REQS_DEATILS_VO";
    
    
    public static String GROUP_PROCESSING_ASSOCS_SCHEDS ="GROUP_PROCESSING_ASSOCS_SCHEDS";
    public static String MANUAL_FILL_EDIT_LIST = "MANUAL_FILL_EDIT_LIST";
    public static String MANUAL_FILL_FORM = "manualFillForm";
    public static String ASSOC_SEARCH_GO_TO_URL = "ASSOC_SEARCH_GO_TO_URL";
    public static String NOT_SCHEDULING = "NOT_SCHEDULING";
    public static String GO_TO_SEARCH_URL = "GO_TO_SEARCH_URL";
    public static String MANUAL_FILL_LIST_RI = "MANUAL_FILL_LIST_RI";
    public static String MANUAL_FILL_CONTEXT = "MANUAL_FILL_CONTEXT";
    public static String REPORT_URL = "REPORT_URL";
    
        
    public static String CURRENT_WEEK = "currWeek";
    public static String CURRENT_YEAR = "currYear";
    public static String LAST_WEEK = "lastWeek";
    public static String LAST_YEAR = "lastYear";
    public static String TAB_SECURITY_CHECK = "TAB_SECURITY_CHECK";
    
    public static final String CURRENT_SCHEDS_FUTURE_WEEKS = "CURRENT_SCHEDS_FUTURE_WEEKS";
    
    public static final String ARCHIVED_DOCUMENTS = "ARCHIVED_DOCUMENTS";
    
    public static final String OFFICE_ATTENDANCE_IMPORT_TYPE = "OFFICE_ATTENDANCE_IMPORT_TYPE";
    public static final String OFFICE_HOURS_IMPORT_FORMAT = "OFFICE_HOURS_IMPORT_FORMAT";
    
    public static final String LtAttdImportTypesEnum_AMAZON = "LtAttdImportTypesEnum_AMAZON";
    public static final String LtAttdImportTypesEnum_UNITIME = "LtAttdImportTypesEnum_UNITIME";
    
    public static final String HOURS_IMPORT_LIST = "HOURS_IMPORT_LIST";
    public static final String HOURS_IMPORT_LIST_DETAILS = "HOURS_IMPORT_LIST_DETAILS";
    public static final String IMPORT_LIST_DETAILS 		 = "IMPORT_LIST_DETAILS";

    public static final String STAFFTRACK_URL = "StafftrackURL";
    
	public static final String OFFICE_UDFS_MAPPED_UDFS = "OFFICE_UDFS_MAPPED_UDFS";
	public static final String OFFICE_UDFS_MAPPED_UDFS_VALUES = "OFFICE_UDFS_MAPPED_UDFS_VALUES";
	public static final String OFFICE_UDFS_MAPPED_UDFS_EDIT_VALUES = "OFFICE_UDFS_MAPPED_UDFS_EDIT_VALUES";
	public static final String OFFICE_MAPPED_DOCUMENTS = "OFFICE_MAPPED_DOCUMENTS";
	
	//USer list
	public static final String LOGGED_USERS_LIST = "LOGGED_USER_LIST";
	
	public static final String ASSOCIATE_PAYROLL_CURRENTSETUP = "ASSOCIATE_PAYROLL_CURRENTSETUP";
	public static final String ASSOCIATE_PAYROLL_CURRENTWEEK = "ASSOCIATE_PAYROLL_CURRENTWEEK";
	public static final String ASSOCIATE_PAYROLL_LASTWEEK = "ASSOCIATE_PAYROLL_LASTWEEK";
	public static final String ASSOCIATE_PAYROLL_HISTORYDETAILS = "ASSOCIATE_PAYROLL_HISTORY";
	public static final String ASSOCIATE_DEDUCTIONS_BILLINGS = "ASSOCIATE_DEDUCTIONS_BILLINGS";
	public static final String ASSOCIATE_DEDUCTIONS_BILLINGS_HISTORY = "ASSOCIATE_DEDUCTIONS_BILLINGS_HISTORY";
	
	public static final String PAYROLL_MANUAL_WORKORDERLIST = "PAYROLL_MANUAL_WORKORDERLIST";
	
	public static final String PAYROLL_TAKEACTION_LIST = "PAYROLL_TAKEACTION_LIST";
	
	public static final String CURRENTSETUP_VIEWEDIT_HISTORY = "CURRENTSETUP_VIEWEDIT_HISTORY";
	
	public static final String PAYROLL_MARKUP_LIST = "PAYROLL_MARKUP_LIST";
	
	public static final String PAYROLL_MARKUP_LIST_HISTORY = "PAYROLL_MARKUP_LIST_HISTORY";
	
	public static final String INVOCIE_GROUPS_LIST = "INVOCIE_GROUPS_LIST";
	
	public static final String ASSOC_DED_AND_EXCEP_BILLING_LIST = "ASSOC_DED_AND_EXCEP_BILLING_LIST";
	public static final String ASSOC_DED_AND_EXCEP_BILLING_HISTORY_LIST = "ASSOC_DED_AND_EXCEP_BILLING_HISTORY_LIST";
	
	public static final String PENDING_APPROVAL_LIST = "PENDING_APPROVAL_LIST";
	public static final String WORKORDER_PENDING_FOR_TW_LIST = "WORKORDER_PENDING_FOR_TW_LIST";
	public static final String WORKORDER_PENDING_FOR_TW_RI_LIST = "WORKORDER_PENDING_FOR_TW_RI_LIST";
	public static final String WORKORDER_PENDING_FOR_TW_PREFIX = "wo_pending_";

	public static final String ASSOC_DEDUCTIONS_BILLINGS_GENERATION_LIST = "ASSOC_DEDUCTIONS_BILLINGS_GENERATION_LIST";
	public static final String ASSOC_DEDUCTIONS_BILLINGS_GENERATION_RI_LIST = "ASSOC_DEDUCTIONS_BILLINGS_GENERATION_RI_LIST";
	public static final String ASSOC_DEDUCTIONS_BILLINGS_GENERATION_PREFIX = "assoc_dedu_bill_";
	
	public static final String WO_CLIENT_REFERENCE_FORM = "WO_CLIENT_REFERENCE_FORM";
	
	public static final String WO_CLIENT_REFERENCE_FORM_UPLOAD = "WO_CLIENT_REFERENCE_FORM_UPLOAD";
	
	public static final String WORKORDER_HISTORY_SCHEMES_LIST = "WORKORDER_HISTORY_SCHEMES_LIST";
	
	public static final String WORK_ORDER_RESULT_ITERATOR = "WORK_ORDER_RESULT_ITERATOR";
	
	public static final String WORK_ORDER_BATCH_RESULT_ITERATOR = "WORK_ORDER_BATCH_RESULT_ITERATOR";
	
	public static final String WORK_ORDERS_GROUPS = "WORK_ORDERS_GROUPS";
	
	public static final String PAYROLL_ATTENDANCE_WITH_MISSING_WORK_ORDERS = "PAYROLL_ATTENDANCE_WITH_MISSING_WORK_ORDERS";
	public static final String PAYROLL_ATTENDANCE_WITH_MISSING_TIME = "PAYROLL_ATTENDANCE_WITH_MISSING_TIME";
	public static final String PAYROLL_TIME_WITH_MISSING_SCHEDULE = "PAYROLL_TIME_WITH_MISSING_SCHEDULE";
	public static final String PAYROLL_TIME_WITH_MULTIPLE_SCHEDULE = "PAYROLL_TIME_WITH_MULTIPLE_SCHEDULE";
	public static final String PAYROLL_TIME_WITH_MISSING_ASSOCIATE = "PAYROLL_TIME_WITH_MISSING_ASSOCIATE";
	
	public static final String TILE_TITLE = "TILE_TITLE";
	public static final String TILE_WEEK_TITLE = "TILE_WEEK_TITLE";
	
	public static final String WO_VALID_SDLP_ERROR_LIST = "WO_VALID_SDLP_ERROR_LIST";
	public static final String WORKORDER_HISTORY_LIST = "WORKORDER_HISTORY_LIST";
	public static final String WORKORDER_APPROVALS_HISTORY_LIST = "WORKORDER_APPROVALS_HISTORY_LIST";	
	public static final String WORK_ORDER_NUMBER = "WORK_ORDER_NUMBER";
	public static final String EVAL_WO_NUM_START = "EVAL_WO_NUM_START";
	public static final String EVAL_WO_NUM_MID = "EVAL_WO_NUM_MID";
	public static final String EVAL_WO_NUM_END = "EVAL_WO_NUM_END";
	public static final String IS_14DIGIT = "IS_14DIGIT";
	public static final String WORKORDER_HISTORY_DETAILS_LIST = "WORKORDER_HISTORY_DETAILS_LIST";
	
	public static final String PAYROLL_TRANSMIT = "PAYROLL_TRANSMIT";
	public static final String PAYROLL_TRANSMIT_YEAR_WISE = "PAYROLL_TRANSMIT_YEAR_WISE";
	public static final String PAYROLL_TRANSMIT_HISTORY = "PAYROLL_TRANSMIT_HISTORY";
	public static final String PAYROLL_TRANSMIT_HISTORY_DETAILS = "PAYROLL_TRANSMIT_HISTORY_DETAILS";
	public static final String PAYROLL_TRANSMIT_HISTORY_ERRORS = "PAYROLL_TRANSMIT_HISTORY_ERRORS";
	
	
	public static final String WORKORDER_TRANSFER_RESULT = "WORKORDER_TRANSFER_RESULT";
	public static final String WORKORDER_TRANSFER_TW_RESULT = "WORKORDER_TRANSFER_TW_RESULT";
	
	public static final String YEAR_NO = "YEAR_NO";
	public static final String WEEK_NO = "WEEK_NO";
	public static final String MODE = "MODE";
	public static final String DISPLAY_MODE = "DISPLAY_MODE";
	public static final String DAY = "DAY";
	
	public static final String MANUAL_WO_REVIEW_LIST  = "MANUAL_WO_REVIEW_LIST";
	
	public static final String TRANSMIT_ERROR_LIST = "TRANSMIT_ERROR_LIST";
	public static final String TRANSMIT_ERROR_DESCRIPTION = "TRANSMIT_ERROR_DESCRIPTION";
	
	public static final String PAYROLL_WORKORDERS_UPLOAD_HISTORY = "PAYROLL_WORKORDERS_UPLOAD_HISTORY";
	public static final String PAYROLL_WORKORDERS_UPLOAD_RESULT_ITERATOR = "PAYROLL_WORKORDERS_UPLOAD_RESULT_ITERATOR";
	
	public static final String PAYROLL_WORKORDERS_UPLOAD_HISTORY_DETAILS = "PAYROLL_WORKORDERS_UPLOAD_HISTORY_DETAILS";
	public static final String PAYROLL_WORKORDERS_UPLOAD_HISTORY_RESULTS = "PAYROLL_WORKORDERS_UPLOAD_HISTORY_RESULTS";
	public static final String PAYROLL_WORKORDERS_UPLOAD_RESULTS_SESSION = "PAYROLL_WORKORDERS_UPLOAD_RESULTS_SESSION";	
	public static final String PAYROLL_WORKORDERS_UPLOAD_DETAILS_RESULT_ITERATOR = "PAYROLL_WORKORDERS_UPLOAD_DETAILS_RESULT_ITERATOR";
	public static final String PAYROLL_WORKORDERS_UPLOAD_RESULTS_RESULT_ITERATOR = "PAYROLL_WORKORDERS_UPLOAD_RESULTS_RESULT_ITERATOR";
	
	public static final String FROM_PAYROLL_PAGE = "FROM_PAYROLL_PAGE";
	public static final String FROM_PAYROLL_WO_NO_SDLP = "FROM_PAYROLL_WO_NO_SDLP";
	
	public static final String IMPORT_HOURS_ERROR_ITERATOR = "IMPORT_HOURS_ERROR_ITERATOR";
	public static final String IMPORT_HOURS_RECORDS_ITERATOR = "IMPORT_HOURS_RECORDS_ITERATOR";
	
	public static final String USER_ID = "USER_ID";
	public static final String LOGIN_ID = "LOGIN_ID";
	
	public static final String SCHEDULED_PAYROLL_REPORTS_LIST = "SCHEDULED_PAYROLL_REPORTS_LIST";
	public static final String OFFICE_TASK_ROLE_LIST = "OFFICE_TASK_ROLE_LIST";
	
	public static final String COUNTRY_ID = "COUNTRY_ID";
	
	public static final String TRANSFERRED_OFFICES = "TRANSFERRED_OFFICES";
	public static final String OFFICE_NUMBER = "OFFICE_NUMBER";
	public static final String OFFICE_NAME = "OFFICE_NAME";
	
	public static final String FROM_PAGE = "fromPage";
	public static final String AAR_APPROVALS_HISTORY_LIST = "AAR_APPROVALS_HISTORY_LIST";
	
	public static final String FROM_HRS_MISMATCH = "FROM_HRS_MISMATCH";
	
	public static final String WO_UPLOAD_TO_STN_RECORDS_ITERATOR = "WO_UPLOAD_TO_STN_RECORDS_ITERATOR";
	public static final String WO_UPLOAD_TO_STN_ERROR_ITERATOR = "WO_UPLOAD_TO_STN_ERROR_ITERATOR";
	
	public static final String WO_UPLOAD_HISTORY_WEEKS_LIST = "WO_UPLOAD_HISTORY_WEEKS_LIST";
	public static final String WO_UPLOAD_HISTORY_WEEKS_LIST_DETAILS = "WO_UPLOAD_HISTORY_WEEKS_LIST_DETAILS";
	
	public static final String REQ_UPLOAD_RECORDS_ITERATOR = "REQ_UPLOAD_RECORDS_ITERATOR";
	public static final String REQ_UPLOAD_ERROR_ITERATOR = "REQ_UPLOAD_ERROR_ITERATOR";
	
	public static final String REQ_UPLOAD_HISTORY_WEEKS_LIST = "REQ_UPLOAD_HISTORY_WEEKS_LIST";
	public static final String REQ_UPLOAD_HISTORY_WEEKS_LIST_DETAILS = "REQ_UPLOAD_HISTORY_WEEKS_LIST_DETAILS";
	
	public static final String BOGUS_SSN_LIST = "BOGUS_SSN_LIST";
	public static final String RECUR_BILLINGS_CREDIT_LIST = "RECUR_BILLINGS_CREDIT_LIST";
	public static final String OFFICE_FAKE_SSN = "OFFICE_FAKE_SSN";
	public static final String RECUR_BILLINGS_CREDIT_HIST_LIST = "RECUR_BILLINGS_CREDIT_HIST_LIST";
	
	public static final String SCHED_WK_BILLINGS_CREDIT_LIST = "SCHED_WK_BILLINGS_CREDIT_LIST";
	public static final String SCHED_WK_BILLINGS_CREDIT_HIST_LIST = "SCHED_WK_BILLINGS_CREDIT_HIST_LIST";
	
	public static final String IS_INACTIVE = "IS_INACTIVE";
	
	public static final String OFFICE_AUDIT_FAILURES_LIST = "OFFICE_AUDIT_FAILURES_LIST";
	
	public static final String NATIONAL_AUDIT_FAILURES_LIST = "NATIONAL_AUDIT_FAILURES_LIST";	
	
	public static final String MULTI_OFFICE = "MULTI_OFFICE";
	
	//Bg Check Type 
	public static final String BACKGROUND_CHECK_TYPE_LIST = "BACKGROUND_CHECK_TYPE_LIST";

	//Bg Check Failure Codes 
	public static final String BACKGROUND_CHECK_FAILURE_CODES_LIST = "BACKGROUND_CHECK_FAILURE_CODES_LIST";
	

	public static final String BG_CHK_PACKAGES_LIST = "BG_CHK_PACKAGES_LIST";
	
	public static final String BG_CHK_PACKAGE_SERV_LIST = "BG_CHK_PACKAGE_SERV_LIST";

	public static final String BG_CHK_SUBMISSION_HISTORY_LIST = "BG_CHK_SUBMISSION_HISTORY_LIST";

    public static final String BG_CHK_ARCHIVED_DOCUMENTS = "BG_CHK_ARCHIVED_DOCUMENTS";
    public static final String BG_CHK_DOCUMENTS = "BG_CHK_DOCUMENTS";

    public static final String MYSTN_ORDER_CHANGE_REASON_LIST = "MYSTN_ORDER_CHANGE_REASON_LIST";
    
    public static final String ISAGENCY = "ISAGENCY";
    
    public static final String ASSOCIATE_WORK_HISTROY = "ASSOCIATE_WORK_HISTROY";
    
    public static final String WORKORDER_VENDORRATE_HISTORY_LIST = "WORKORDER_VENDORRATE_HISTORY_LIST";
    
    public static final String PAY_TYPE_ID = "PAY_TYPE_ID";
    
    public static final String IS_OFFICE_VMS_ENABLED = "IS_OFFICE_VMS_ENABLED";
    
	public static final String OFFICE_START_SESSIONS = "OFFICE_START_SESSIONS";
	
	public static final String WHITE_BOARD_GROUP_TOTALS = "WHITE_BOARD_GROUP_TOTALS";
	
	
	public static final String IMPORT_ATTENDANCE_ERROR_ITERATOR = "IMPORT_ATTENDANCE_ERROR_ITERATOR";
	public static final String IMPORT_ATTENDANCE_LIST = "IMPORT_ATTENDANCE_LIST";
	
	public static final String ASSOC_MARKED_ATTENDANCE = "ASSOC_MARKED_ATTENDANCE";
	
	public static final String IS_OFFICE_WITH_AMZ_SETTINGS = "IS_OFFICE_WITH_AMZ_SETTINGS";
	
	public static final String START_SESSION_YEARS_LIST="START_SESSION_YEARS_LIST";
	public static final String START_SESSION_MONTHS_LIST="START_SESSION_MONTHS_LIST";
	
	public static final String CAAR_IMPORT_ERROR_RECORDS_ITERATOR = "CAAR_IMPORT_ERROR_RECORDS_ITERATOR";
	
	public static final String GET_ALL_RECORDS = "GET_ALL_RECORDS";
	
	public static final String VENDOR_RESOURCE_ASSIGN_RECORDS_ITERATOR = "VENDOR_RESOURCE_ASSIGN_RECORDS_ITERATOR";
	
	public static final String ASSOCIATE_DOCUMENTS = "ASSOCIATE_DOCUMENTS";
	
	public static final String RECRUITING_APPLICANTS_COUNT_VO = "RECRUITING_APPLICANTS_COUNT_VO";
	
	public static final String RECRUITING_APPLICANTS_LIST_VO = "RECRUITING_APPLICANTS_LIST_VO";
	
	public static final String APPLICANT_TYPE = "APPLICANT_TYPE";
	
	public static final String I9_RECRUITER_REV_LIST_VO = "I9_RECRUITER_REV_LIST_VO";
	
	public static final String IS_PRO_OFFICE = "IS_PRO_OFFICE";
	
	public static final String DT_RECRUITER_RES_LIST_VO = "DT_RECRUITER_RES_LIST_VO";
	
	public static final String SKILLS_TEST_FAILURE_LIST = "SKILLS_TEST_FAILURE_LIST" ;
	
	public static final String RECRUITING_APPLICANTS_RESULT_ITERATOR = "RECRUITING_APPLICANTS_RESULT_ITERATOR";
	
	public static final String ASSOCIATE_JOB_DETAILS_LIST = "ASSOCIATE_JOB_DETAILS_LIST";
	
	public static final String LOCAL_USER_SEARCH_VO = "LOCAL_USER_SEARCH_VO"; 
	
	public static final String LOCAL_USER_LIST = "LOCAL_USER_LIST";
	
	public static final String ASSOCIATE_STATUS = "ASSOCIATE_STATUS";
	
	public static final String ASSOCIATE_DOCUMENT_ID = "ASSOCIATE_DOCUMENT_ID";
	
	public static final String LOCAL_USERS_LIST_RESULT_ITERATOR = "LOCAL_USERS_LIST_RESULT_ITERATOR";
	
	public static final String PRO_OFFLINE_MANAGEMENT_VO = "PRO_OFFLINE_MANAGEMENT_VO";
	
	public static final String IMPORTED_PRO_OFFLINE_ASSOCS_LIST_VO = "IMPORTED_PRO_OFFLINE_ASSOCS_LIST_VO";
	
	public static final String RECENT_IMPORTS_RESULT_ITERATOR = "RECENT_IMPORTS_RESULT_ITERATOR";
	
	public static final String SCHEDULED_RECRUITING_REPORTS_LIST = "SCHEDULED_RECRUITING_REPORTS_LIST";
	
	public static final String PRODUCTIVITY_RECORDS_LIST = "PRODUCTIVITY_RECORDS_LIST";
	
	public static final String ASSOCIATE_PRODUCTIVITY_SCORES = "ASSOCIATE_PRODUCTIVITY";
	
	public static final String PREV_DISTRIBUTED_ORDERS_RESULT_ITERATOR = "PREV_DISTRIBUTED_ORDERS_RESULT_ITERATOR";
	
	public static final String FROM_TAKE_ACTION_MAIN_PAGE = "FROM_TAKE_ACTION_MAIN_PAGE";
	
	public static final String IS_OFFICE_IN_PA_STATE = "IS_OFFICE_IN_PA_STATE";
	
	public static final String CREWDESK_OFFICE_RECRUITING_CENTER_ID = "CREWDESK_OFFICE_RECRUITING_CENTER_ID";
	
	public static final String ASSOCIATE_TERMINATIONS_HISTORY_LIST = "ASSOCIATE_TERMINATIONS_HISTORY_LIST";
	
	public static final String WO_TAGPAD_ATTRIBUTES_ERROR_LIST = "WO_TAGPAD_ATTRIBUTES_ERROR_LIST";
	
	public static final String RECRUITING_PAYROLL_NON_COMPL_APPLICANTS = "RECRUITING_PAYROLL_NON_COMPL_APPLICANTS";
	
	public static final String RECRUITING_PENDING_ASSOCIATES_INFO = "RECRUITING_PENDING_ASSOCIATES_INFO";
	
	public static final String WORKFORCE_VIEWMORE_PENDING_ASSOCIATES_INFO = "WORKFORCE_VIEWMORE_PENDING_ASSOCIATES_INFO";
	
	public static String ACTIVITY_VO ="ACTIVITY_VO";
	
	public static final String WORKFORCE_NONCOMPLASSOC_RESULT_ITERATOR = "WORKFORCE_NONCOMPLASSOC_RESULT_ITERATOR";
	
	public static String REFRESH_RATE_VO ="REFRESH_RATE_VO";
	
	public static final String ASSOC_ERRORS_LIST = "ASSOC_ERRORS_LIST";
	
	public static final String WO_ERRORS_LIST = "WO_ERRORS_LIST";
	
	public static final String ACTIVE_USERS_LIST_FOR_OFFICE = "ACTIVE_USERS_LIST_FOR_OFFICE";
	
	public static final String ASSOC_MIDWK_TRANSMIT_VO = "ASSOC_MIDWK_TRANSMIT_VO";
	
	public static final String OFFICE_PAYROLL_NEW_PAYTYPES = "OFFICE_PAYROLL_NEW_PAYTYPES";
	public static final String DISABLE_ENABLE_SAVE_LINK = "DISABLE_ENABLE_SAVE_LINK";
	public static final String OFFICE_PAYROLL_LT_TW_PAYTYPES = "OFFICE_PAYROLL_LT_TW_PAYTYPES";
	
	public static final String DRUG_TEST_REVIEW_COUNTS = "DRUG_TEST_REVIEW_COUNTS";
	public static final String IMPORT_DRUGS_RECORDS_ITERATOR = "IMPORT_DRUGS_RECORDS_ITERATOR";
	
	public static final String PRD_STARTS_COUNTS = "PRD_STARTS_COUNTS";
	
	public static final String OFFICE_TEST_RESULTS_LIST = "OFFICE_TEST_RESULTS_LIST";
	public static final String OFFICE_TEST_VENDORS_LIST = "OFFICE_TEST_VENDORS_LIST";
	
	public static final String CACHE_LIST = "CACHE_LIST";
	
	public static final String OFFICE_IPADDRESS = "OFFICE_IPADDRESS";
	
	public static String JOB_TITLE_ADDEDIT_TILE_TYPE = "JobTitleAddEditTile_type";
	public static String JOB_TITLE_VIEWALL_TYPE = "viewAll_type";
	public static final String OFFICE_JOB_TITLES = "OFFICE_JOB_TITLES";
	
	public static final String CLIENT_ORDERS_LIST = "CLIENT_ORDERS_LIST";
	public static final String SYSTEM_SETTINGS = "SYSTEM_SETTINGS";
	
	//UC - PRO Enhancements
	public static final String LT_INDUSTRY_TYPES = "LT_INDUSTRY_TYPES";
	public static final String OFFICE_INDUSTRIES = "OFFICE_INDUSTRIES";
	public static final String OFFICE_RECRUITING_CENTERS = "OFFICE_RECRUITING_CENTERS";
	public static final String OFFICE_WORK_LOCATIONS = "OFFICE_WORK_LOCATIONS";
	
	//UC - Regenerate Invoice
	public static final String REV_INV_HIST_LIST = "REV_INV_HIST_LIST";
	public static final String REV_INV_HIST_LIST_DETAILS = "REV_INV_HIST_LIST_DETAILS";
	
	public static final String FORECASTED_ORD_LIST_HISTORY = "FORECASTED_ORD_LIST_HISTORY";
	
	public static final String OFFICE_ORDER_START_SESSIONS = "OFFICE_ORDER_START_SESSIONS";
	public static final String START_SESSIONS_LIST_HISTORY = "START_SESSIONS_LIST_HISTORY";
	
	// Temp Works Transfer Results
	public static final String TEMP_WORKS_TRANSFER_RESULTS_LIST_VO = "TEMP_WORKS_TRANSFER_RESULTS_LIST_VO";
	public static final String TEMP_WORKS_TRANSFER_RESULTS_RESULT_ITERATOR = "TEMP_WORKS_TRANSFER_RESULTS_RESULT_ITERATOR";
	
	public static final String PAYROLL_TRANSFER_ERROR_LIST = "PAYROLL_TRANSFER_ERROR_LIST";
	
	public static final String ASSOCIATE_WOTC_TRANSMIT_LIST = "ASSOCIATE_WOTC_TRANSMIT_LIST";
	
	public static final String PAYROLL_TRANS_ERR_LST_REASON = "PAYROLL_TRANS_ERR_LST_REASON";
	
	//Fieldglass phase  - II 
	public static final String STAFFTRACK_IMPORT_ERRORS_LIST = "STAFFTRACK_IMPORT_ERRORS_LIST";
	public static final String STAFFTRACK_IMPORT_ERRORS_RECORDS_ITERATOR = "STAFFTRACK_IMPORT_ERRORS_RECORDS_ITERATOR";
	
	public static final String REVENUE_VERIFICATION_SUMMARY_VO = "REVENUE_VERIFICATION_SUMMARY_VO";
	
	public static final String ASSOC_WOTC_MISSING_DOCS_COUNTS = "ASSOC_WOTC_MISSING_DOCS_COUNTS";
	public static final String ASSOC_WOTC_MISSING_DOCS_LIST = "ASSOC_WOTC_MISSING_DOCS_LIST";
	public static final String ASSOC_WOTC_MISSING_DOCS_RESULT_ITERATOR = "ASSOC_WOTC_MISSING_DOCS_RESULT_ITERATOR";
	public static final String TODATE_DATE = "TODATE_DATE";
	public static final String WOTC_PRINT_FORM_PDF_URL = "WOTC_PRINT_FORM_PDF_URL";
	public static final String ADD_EDIT_ADNL_WOTC_DOC_NEEDED = "ADD_EDIT_ADNL_WOTC_DOC_NEEDED";
	public static final String SHOW_ADDITIONAL_DOC_PAGE = "SHOW_ADDITIONAL_DOC_PAGE";
	public static final String WOTC_DOC_RECEIVED_DATE = "WOTC_DOC_RECEIVED_DATE";
	
	public static final String ASSOCIATE_TAG_PAD_ERROR_LIST = "ASSOCIATE_TAG_PAD_ERROR_LIST";
	
	public static final String ASSOC_ID_COPIES_LIST= "ASSOC_ID_COPIES_LIST";//SMSTN-13109 : I9 compliance update
	
	public static final String DRUG_TEST_VENDOR_LIST = "DRUG_TEST_VENDOR_LIST";
	public static final String DRUG_TEST_VENDOR_HISTORY_LIST = "DRUG_TEST_VENDOR_HISTORY_LIST";
	public static final String DRUG_TEST_PACKAGE_LIST = "DRUG_TEST_PACKAGE_LIST";
	public static final String DRUG_TEST_PACKAGE_HIST_LIST = "DRUG_TEST_PACKAGE_HIST_LIST";
	public static final String DRUG_TEST_HISTORY_LIST = "DRUG_TEST_HISTORY_LIST";
	
}
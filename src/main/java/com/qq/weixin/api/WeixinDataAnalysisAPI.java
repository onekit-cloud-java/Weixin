package com.qq.weixin.api;

import com.qq.weixin.api.DataAnalysis.request.*;
import com.qq.weixin.api.DataAnalysis.response.*;


@SuppressWarnings("unused")
public interface WeixinDataAnalysisAPI {



    GetDailyRetainResponse getDailyRetain(GetDailyRetainRequest getDailyRetainRequest);

    GetMonthlyRetainResponse getMonthlyRetain(GetMonthlyRetainRequest getMonthlyRetainRequest);

    GetWeeklyRetainResponse getWeeklyRetain(GetWeeklyRetainRequest getWeeklyRetainRequest);

    GetDailySummaryResponse getDailySummary(GetDailySummaryRequest getDailySummaryRequest);

    GetDailyVisitTrendResponse getDailyVisitTrend(GetDailyVisitTrendRequest getDailyVisitTrendRequest);

    GetMonthlyVisitTrendResponse getMonthlyVisitTrend(GetMonthlyVisitTrendRequest getMonthlyVisitTrendRequest);

    GetWeeklyVisitTrendResponse getWeeklyVisitTrend(GetWeeklyVisitTrendRequest getWeeklyVisitTrendRequest);

    GetPerformanceDataResponse getPerformanceData(GetPerformanceDataRequest getPerformanceDataRequest);

    GetUserPortraitResponse getUserPortrait(GetUserPortraitRequest getUserPortraitRequest);

    GetVisitDistributionResponse getVisitDistribution(GetVisitDistributionRequest getVisitDistributionRequest);

    GetVisitPageResponse getVisitPage(GetVisitPageRequest getVisitPageRequest);



























}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    [Obsolete(@"aquasec.index/getintegrationregistry.getIntegrationRegistry has been deprecated in favor of aquasec.index/getintegrationregistries.getIntegrationRegistries")]
    public static class GetIntegrationRegistry
    {
        public static Task<GetIntegrationRegistryResult> InvokeAsync(GetIntegrationRegistryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIntegrationRegistryResult>("aquasec:index/getIntegrationRegistry:getIntegrationRegistry", args ?? new GetIntegrationRegistryArgs(), options.WithDefaults());

        public static Output<GetIntegrationRegistryResult> Invoke(GetIntegrationRegistryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationRegistryResult>("aquasec:index/getIntegrationRegistry:getIntegrationRegistry", args ?? new GetIntegrationRegistryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIntegrationRegistryArgs : global::Pulumi.InvokeArgs
    {
        [Input("advancedSettingsCleanup")]
        public bool? AdvancedSettingsCleanup { get; set; }

        [Input("alwaysPullPatterns")]
        private List<string>? _alwaysPullPatterns;
        public List<string> AlwaysPullPatterns
        {
            get => _alwaysPullPatterns ?? (_alwaysPullPatterns = new List<string>());
            set => _alwaysPullPatterns = value;
        }

        [Input("imageCreationDateCondition")]
        public string? ImageCreationDateCondition { get; set; }

        [Input("lastupdate")]
        public int? Lastupdate { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("options")]
        private List<Inputs.GetIntegrationRegistryOptionArgs>? _options;
        public List<Inputs.GetIntegrationRegistryOptionArgs> Options
        {
            get => _options ?? (_options = new List<Inputs.GetIntegrationRegistryOptionArgs>());
            set => _options = value;
        }

        [Input("pullImageAge")]
        public string? PullImageAge { get; set; }

        [Input("pullImageCount")]
        public int? PullImageCount { get; set; }

        [Input("pullImageTagPatterns")]
        private List<string>? _pullImageTagPatterns;
        public List<string> PullImageTagPatterns
        {
            get => _pullImageTagPatterns ?? (_pullImageTagPatterns = new List<string>());
            set => _pullImageTagPatterns = value;
        }

        [Input("pullRepoPatternsExcludeds")]
        private List<string>? _pullRepoPatternsExcludeds;
        public List<string> PullRepoPatternsExcludeds
        {
            get => _pullRepoPatternsExcludeds ?? (_pullRepoPatternsExcludeds = new List<string>());
            set => _pullRepoPatternsExcludeds = value;
        }

        [Input("registryScanTimeout")]
        public int? RegistryScanTimeout { get; set; }

        [Input("scannerNames")]
        private List<string>? _scannerNames;
        public List<string> ScannerNames
        {
            get => _scannerNames ?? (_scannerNames = new List<string>());
            set => _scannerNames = value;
        }

        [Input("scannerType")]
        public string? ScannerType { get; set; }

        [Input("webhooks")]
        private List<Inputs.GetIntegrationRegistryWebhookArgs>? _webhooks;
        public List<Inputs.GetIntegrationRegistryWebhookArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new List<Inputs.GetIntegrationRegistryWebhookArgs>());
            set => _webhooks = value;
        }

        public GetIntegrationRegistryArgs()
        {
        }
        public static new GetIntegrationRegistryArgs Empty => new GetIntegrationRegistryArgs();
    }

    public sealed class GetIntegrationRegistryInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("advancedSettingsCleanup")]
        public Input<bool>? AdvancedSettingsCleanup { get; set; }

        [Input("alwaysPullPatterns")]
        private InputList<string>? _alwaysPullPatterns;
        public InputList<string> AlwaysPullPatterns
        {
            get => _alwaysPullPatterns ?? (_alwaysPullPatterns = new InputList<string>());
            set => _alwaysPullPatterns = value;
        }

        [Input("imageCreationDateCondition")]
        public Input<string>? ImageCreationDateCondition { get; set; }

        [Input("lastupdate")]
        public Input<int>? Lastupdate { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("options")]
        private InputList<Inputs.GetIntegrationRegistryOptionInputArgs>? _options;
        public InputList<Inputs.GetIntegrationRegistryOptionInputArgs> Options
        {
            get => _options ?? (_options = new InputList<Inputs.GetIntegrationRegistryOptionInputArgs>());
            set => _options = value;
        }

        [Input("pullImageAge")]
        public Input<string>? PullImageAge { get; set; }

        [Input("pullImageCount")]
        public Input<int>? PullImageCount { get; set; }

        [Input("pullImageTagPatterns")]
        private InputList<string>? _pullImageTagPatterns;
        public InputList<string> PullImageTagPatterns
        {
            get => _pullImageTagPatterns ?? (_pullImageTagPatterns = new InputList<string>());
            set => _pullImageTagPatterns = value;
        }

        [Input("pullRepoPatternsExcludeds")]
        private InputList<string>? _pullRepoPatternsExcludeds;
        public InputList<string> PullRepoPatternsExcludeds
        {
            get => _pullRepoPatternsExcludeds ?? (_pullRepoPatternsExcludeds = new InputList<string>());
            set => _pullRepoPatternsExcludeds = value;
        }

        [Input("registryScanTimeout")]
        public Input<int>? RegistryScanTimeout { get; set; }

        [Input("scannerNames")]
        private InputList<string>? _scannerNames;
        public InputList<string> ScannerNames
        {
            get => _scannerNames ?? (_scannerNames = new InputList<string>());
            set => _scannerNames = value;
        }

        [Input("scannerType")]
        public Input<string>? ScannerType { get; set; }

        [Input("webhooks")]
        private InputList<Inputs.GetIntegrationRegistryWebhookInputArgs>? _webhooks;
        public InputList<Inputs.GetIntegrationRegistryWebhookInputArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new InputList<Inputs.GetIntegrationRegistryWebhookInputArgs>());
            set => _webhooks = value;
        }

        public GetIntegrationRegistryInvokeArgs()
        {
        }
        public static new GetIntegrationRegistryInvokeArgs Empty => new GetIntegrationRegistryInvokeArgs();
    }


    [OutputType]
    public sealed class GetIntegrationRegistryResult
    {
        public readonly bool? AdvancedSettingsCleanup;
        public readonly ImmutableArray<string> AlwaysPullPatterns;
        public readonly bool AutoCleanup;
        public readonly bool AutoPull;
        public readonly int AutoPullInterval;
        public readonly int AutoPullMax;
        public readonly bool AutoPullRescan;
        public readonly string AutoPullTime;
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ImageCreationDateCondition;
        public readonly int Lastupdate;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetIntegrationRegistryOptionResult> Options;
        public readonly string Password;
        public readonly ImmutableArray<string> Prefixes;
        public readonly string PullImageAge;
        public readonly int PullImageCount;
        public readonly ImmutableArray<string> PullImageTagPatterns;
        public readonly ImmutableArray<string> PullRepoPatternsExcludeds;
        public readonly int? RegistryScanTimeout;
        public readonly ImmutableArray<string> ScannerNames;
        public readonly string ScannerType;
        public readonly string Type;
        public readonly string Url;
        public readonly string Username;
        public readonly ImmutableArray<Outputs.GetIntegrationRegistryWebhookResult> Webhooks;

        [OutputConstructor]
        private GetIntegrationRegistryResult(
            bool? advancedSettingsCleanup,

            ImmutableArray<string> alwaysPullPatterns,

            bool autoCleanup,

            bool autoPull,

            int autoPullInterval,

            int autoPullMax,

            bool autoPullRescan,

            string autoPullTime,

            string description,

            string id,

            string imageCreationDateCondition,

            int lastupdate,

            string name,

            ImmutableArray<Outputs.GetIntegrationRegistryOptionResult> options,

            string password,

            ImmutableArray<string> prefixes,

            string pullImageAge,

            int pullImageCount,

            ImmutableArray<string> pullImageTagPatterns,

            ImmutableArray<string> pullRepoPatternsExcludeds,

            int? registryScanTimeout,

            ImmutableArray<string> scannerNames,

            string scannerType,

            string type,

            string url,

            string username,

            ImmutableArray<Outputs.GetIntegrationRegistryWebhookResult> webhooks)
        {
            AdvancedSettingsCleanup = advancedSettingsCleanup;
            AlwaysPullPatterns = alwaysPullPatterns;
            AutoCleanup = autoCleanup;
            AutoPull = autoPull;
            AutoPullInterval = autoPullInterval;
            AutoPullMax = autoPullMax;
            AutoPullRescan = autoPullRescan;
            AutoPullTime = autoPullTime;
            Description = description;
            Id = id;
            ImageCreationDateCondition = imageCreationDateCondition;
            Lastupdate = lastupdate;
            Name = name;
            Options = options;
            Password = password;
            Prefixes = prefixes;
            PullImageAge = pullImageAge;
            PullImageCount = pullImageCount;
            PullImageTagPatterns = pullImageTagPatterns;
            PullRepoPatternsExcludeds = pullRepoPatternsExcludeds;
            RegistryScanTimeout = registryScanTimeout;
            ScannerNames = scannerNames;
            ScannerType = scannerType;
            Type = type;
            Url = url;
            Username = username;
            Webhooks = webhooks;
        }
    }
}
